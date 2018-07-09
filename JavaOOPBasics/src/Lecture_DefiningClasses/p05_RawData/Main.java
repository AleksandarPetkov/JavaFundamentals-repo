package Lecture_DefiningClasses.p05_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Car> allCars = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split("\\s+");

            String carModel = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);

            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);

            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);

            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Engine engine = new Engine(enginePower, engineSpeed);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tyres> tyres = new ArrayList<>();

            for (int j = 5; j < tokens.length - 1; j+=2) {
                double pressure = Double.parseDouble(tokens[j]);
                int age = Integer.parseInt(tokens[j+1]);

                Tyres currentTire = new Tyres(pressure,age);

                tyres.add(currentTire);
            }
            Car car = new Car(carModel, engine, cargo , tyres);
            allCars.add(car);
        }

        String command = reader.readLine();

        if (command.equals("fragile")){
            allCars.stream().filter(car -> car.getTyres()
            .stream().filter(tire -> tire.getPressure() < 1).collect(Collectors.toList()).size() > 0)
                    .filter(car -> car.getCargo().getCargoType().equals("fragile")).forEach(System.out::println);
        } else if(command.equals("flamable")){
            allCars.stream().filter(car -> "flamable".equals(car.getCargo().getCargoType()))
                    .filter(car -> car.getEngine().getEnginePower() > 250)
                    .forEach(System.out::println);
        }

    }
}
