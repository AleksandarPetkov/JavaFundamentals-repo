package ExamPreparationNFS;

import ExamPreparationNFS.cars.Car;
import ExamPreparationNFS.cars.PerformanceCar;
import ExamPreparationNFS.cars.ShowCar;
import ExamPreparationNFS.races.CasualRace;
import ExamPreparationNFS.races.DragRace;
import ExamPreparationNFS.races.DriftRace;
import ExamPreparationNFS.races.Race;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CarManager {
    private Map<Integer, Car> allCars;
    private Map<Integer, Race> allRaces;
    private Garage garage;

    public CarManager() {
        this.allCars = new LinkedHashMap<>();
        this.allRaces = new LinkedHashMap<>();
        this.garage = new Garage();
    }

    private Map<Integer, Car> getAllCars() {
        return this.allCars;
    }

    private Map<Integer, Race> getAllRaces() {
        return this.allRaces;
    }

    private Garage getGarage() {
        return this.garage;
    }

    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        Car car = null;
        if (type.equals("Performance")) {
            car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        } else if (type.equals("Show")) {
            car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        } else {
            return;
        }
        allCars.put(id, car);
    }

    public String check(int id) {
        return allCars.get(id).toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        switch (type) {
            case "Casual":
                Race race = new CasualRace(length, route, prizePool);
                allRaces.put(id, race);
                break;
            case "Drag":
                Race race1 = new DragRace(length, route, prizePool);
                allRaces.put(id, race1);
                break;
            case "Drift":
                Race race2 = new DriftRace(length, route, prizePool);
                allRaces.put(id, race2);
                break;
        }
    }

    public void participate(int carId, int raceId) {
        Car currentCar = allCars.get(carId);
        if (!this.garage.getParkedCars().contains(currentCar)) {
            this.allRaces.get(raceId).getParticipants().add(currentCar);
        }
    }

    public String start(int raceId) {
        Map<Integer, Car> winners = new LinkedHashMap<>();

        Race currentRace = allRaces.get(raceId);
        if (currentRace.getParticipants().isEmpty()) {
            return "Cannot start the race with zero participants.";
        }

        switch (currentRace.getClass().getSimpleName()) {
            case "CasualRace":
                casualRace(currentRace, winners);
                break;
            case "DragRace":
                dragRace(currentRace, winners);
                break;
            case "DriftRace":
                driftRace(currentRace, winners);
                break;
        }

//        o	“{route} - {length}
//        o	 1. {brand} {model} {performancePoints}PP - ${moneyWon

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %d", currentRace.getRoute(), currentRace.getLenght())).append(System.lineSeparator());

        HashMap<Integer, Car> sortedWinners = winners.entrySet().stream().sorted((x1, x2) -> {
            int comp1 = x1.getKey();
            int comp2 = x2.getKey();
            return Integer.compare(comp2, comp1);
        }) .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
//
        int counter = 1;
        for (Integer points : sortedWinners.keySet()) {
            if (counter == 4){
                break;
            }
            Car currentCar = sortedWinners.get(points);
            sb.append(String.format("%d. %s %s %dPP - $%d", counter, currentCar.getBrand(), currentCar.getModel(), points,
                    moneyWon(counter, currentRace.getPrizePool())))
                    .append(System.lineSeparator());
             counter++;
        }
        return sb.toString();
    }


    public void park(int carId) {
        Car currentCar = this.allCars.get(carId);
        boolean checkCarIsInTheRace = false;
        for (Race race : allRaces.values()) {
            if (race.getParticipants().contains(currentCar)) {
                checkCarIsInTheRace = true;
            }
        }
        if (checkCarIsInTheRace == false) {
            this.garage.getParkedCars().add(currentCar);
        }
    }

    public void unpark(int carId) {
        Car currentCar = allCars.get(carId);
        garage.getParkedCars().remove(currentCar);
    }

    public void tune(int tuneIndex, String addOn) {
        for (Car car : garage.getParkedCars()) {
            car.setHorsepowerByTune(tuneIndex);
            car.setSuspensionByTune(tuneIndex);

            if (car.getClass().getSimpleName().equals("PerformanceCar")) { // Take class name by reflection
                car.getAddOns().add(addOn);

            } else if (car.getClass().getSimpleName().equals("ShowCar")) {
                car.setStars(tuneIndex);

            } else {
                return;
            }
        }
    }

    //////////////////////////////
//    by 25% = 100 – (100 * 25) / 100 = 100
    private int moneyWon(int counter, int prizePool) {
        int price = 0;
        switch (counter){
            case 1:
                price = prizePool - ((prizePool*50)/100);
                break;
            case 2:
                price = prizePool - ((prizePool*70)/100);
                break;
            case 3:
                price = prizePool - ((prizePool*80)/100);
                break;
        }
        return price;
    }

    private void casualRace(Race currentRace, Map<Integer, Car> winners) {
        int points = 0;
        for (Car car : currentRace.getParticipants()) {
//            (horsepower / acceleration) + (suspension + durability)
            points = (car.getHorsepower() / car.getAcceleration()) + (car.getSuspension() + car.getDurability());
            winners.put(points, car);
        }
    }

    private void dragRace(Race currentRace, Map<Integer, Car> winners) {
        int points = 0;
        for (Car car : currentRace.getParticipants()) {
            //        (horsepower / acceleration)
            points = (car.getHorsepower() / car.getAcceleration());
            winners.put(points, car);
        }
    }

    private void driftRace(Race currentRace, Map<Integer, Car> winners) {
        int points = 0;
        for (Car car : currentRace.getParticipants()) {
//            (suspension + durability)
            points = (car.getSuspension() + car.getDurability());
            winners.put(points, car);
        }
    }
}
