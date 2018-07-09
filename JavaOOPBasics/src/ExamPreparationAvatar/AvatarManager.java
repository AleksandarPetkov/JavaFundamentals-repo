package ExamPreparationAvatar;

import ExamPreparationAvatar.benders.*;
import ExamPreparationAvatar.monuments.*;

public class AvatarManager {
    static int countOfWars = 1;

    private Nations airNation;
    private Nations waterNation;
    private Nations fireNation;
    private Nations earthNation;

    public AvatarManager() {
        this.airNation = new Nations();
        this.waterNation = new Nations();
        this.fireNation = new Nations();
        this.earthNation = new Nations();
    }

    public int setCountOfWars() {
        return countOfWars++;
    }

    public void Bender(String type, String name, int power, double secParam) {

        switch (type) {
            case "Air":
                Benders airBender = new AirBender(name, power, secParam);
                this.airNation.getBenders().add(airBender);
                break;
            case "Water":
                Benders waterBender = new WaterBender(name, power, secParam);
                this.waterNation.getBenders().add(waterBender);
                break;
            case "Fire":
                Benders fireBender = new FireBender(name, power, secParam);
                this.fireNation.getBenders().add(fireBender);
                break;
            case "Earth":
                Benders earthBender = new EarthBender(name, power, secParam);
                this.earthNation.getBenders().add(earthBender);
                break;
        }
    }

    public void Monument(String type, String name, int affinity) {
        switch (type) {
            case "Air":
                Monuments airMonument = new AirMonument(name, affinity);
                this.airNation.getMonuments().add(airMonument);
                break;
            case "Water":
                Monuments waterMonument = new WaterMonument(name, affinity);
                this.waterNation.getMonuments().add(waterMonument);
                break;
            case "Fire":
                Monuments fireMonument = new FireMonument(name, affinity);
                this.fireNation.getMonuments().add(fireMonument);
                break;
            case "Earth":
                Monuments earthMonument = new EarthMonument(name, affinity);
                this.earthNation.getMonuments().add(earthMonument);
                break;
        }
    }

    public String Status(String nation) {

        switch (nation) {
            case "Air":
                return statusAirNation(this.airNation);
            case "Water":
                return statusWater(this.waterNation);
            case "Fire":
                return statusFire(this.fireNation);
            case "Earth":
                return statusEarth(this.earthNation);
        }

        return null;
    }

    public String War(String nation) {
        double airTotalPower = getAirTotalPower(airNation);
        double waterTotalPower = getAirTotalPower(waterNation);
        double fireTotalPower = getAirTotalPower(fireNation);
        double earthTotalPower = getAirTotalPower(earthNation);

        if (airTotalPower > waterTotalPower && airTotalPower > fireTotalPower && airTotalPower > earthTotalPower) {
            waterNation.getMonuments().clear();
            waterNation.getBenders().clear();

            fireNation.getBenders().clear();
            fireNation.getMonuments().clear();

            earthNation.getMonuments().clear();
            earthNation.getBenders().clear();
        } else if (waterTotalPower > airTotalPower && waterTotalPower > fireTotalPower && waterTotalPower > earthTotalPower) {
            airNation.getMonuments().clear();
            airNation.getBenders().clear();

            fireNation.getBenders().clear();
            fireNation.getMonuments().clear();

            earthNation.getMonuments().clear();
            earthNation.getBenders().clear();
        } else if (fireTotalPower > airTotalPower && fireTotalPower > waterTotalPower && fireTotalPower > earthTotalPower) {
            airNation.getMonuments().clear();
            airNation.getBenders().clear();

            waterNation.getBenders().clear();
            waterNation.getMonuments().clear();

            earthNation.getMonuments().clear();
            earthNation.getBenders().clear();
        } else {
            airNation.getMonuments().clear();
            airNation.getBenders().clear();

            waterNation.getBenders().clear();
            waterNation.getMonuments().clear();

            fireNation.getMonuments().clear();
            fireNation.getBenders().clear();
        }

        return String.format("War %d issued by %s%n", setCountOfWars(), nation);
    }

    private double getAirTotalPower(Nations airNation) {
        double totalPower = 0;
        double totalBenderPoints = 0;
        double totalMonumentsPoints = 0;
        for (Benders bender : airNation.getBenders()) {
            totalBenderPoints += bender.getBenderTotalPower();
        }

        for (Monuments monument : airNation.getMonuments()) {
            totalMonumentsPoints += monument.getAfiinity();
        }

//        (1000 / 100) * 300 = 3000
        totalPower = ((totalBenderPoints / 100) * totalMonumentsPoints) + totalBenderPoints;
        return totalPower;
    }
    //////// WAR METHODS ///////


    ///////////////////////////////////

    private String statusEarth(Nations earthNation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Earth Nation").append(System.lineSeparator());

        if (earthNation.getBenders().size() == 0) {
            sb.append("Benders: None").append(System.lineSeparator());
        } else {
            sb.append("Benders:").append(System.lineSeparator());
            for (Benders benders : earthNation.getBenders()) {
                sb.append(benders.toString());
            }
        }

        //Monuments Status
        if (earthNation.getMonuments().size() == 0) {
            sb.append("Monuments: None").append(System.lineSeparator());
        } else {
            sb.append("Monuments:").append(System.lineSeparator());
            for (Monuments monuments : earthNation.getMonuments()) {
                sb.append(monuments.toString());
            }
        }

        return sb.toString();

    }

    private String statusFire(Nations fireNation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fire Nation").append(System.lineSeparator());

        if (fireNation.getBenders().size() == 0) {
            sb.append("Benders: None").append(System.lineSeparator());
        } else {
            sb.append("Benders:").append(System.lineSeparator());
            for (Benders benders : fireNation.getBenders()) {
                sb.append(benders.toString());
            }
        }

        //Monuments Status
        if (fireNation.getMonuments().size() == 0) {
            sb.append("Monuments: None").append(System.lineSeparator());
        } else {
            sb.append("Monuments:").append(System.lineSeparator());
            for (Monuments monuments : fireNation.getMonuments()) {
                sb.append(monuments.toString());
            }
        }

        return sb.toString();
    }

    private String statusWater(Nations waterNation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Water Nation").append(System.lineSeparator());

        if (waterNation.getBenders().size() == 0) {
            sb.append("Benders: None").append(System.lineSeparator());
        } else {
            sb.append("Benders:").append(System.lineSeparator());
            for (Benders benders : waterNation.getBenders()) {
                sb.append(benders.toString());
            }
        }

        //Monuments Status
        if (waterNation.getMonuments().size() == 0) {
            sb.append("Monuments: None").append(System.lineSeparator());
        } else {
            sb.append("Monuments:").append(System.lineSeparator());
            for (Monuments monuments : waterNation.getMonuments()) {
                sb.append(monuments.toString());
            }
        }

        return sb.toString();
    }

    private String statusAirNation(Nations airNation) {
        StringBuilder sb = new StringBuilder();
        sb.append("Air Nation").append(System.lineSeparator());

        if (airNation.getBenders().size() == 0) {
            sb.append("Benders: None").append(System.lineSeparator());
        } else {
            sb.append("Benders:").append(System.lineSeparator());
            for (Benders benders : airNation.getBenders()) {
                sb.append(benders.toString());
            }
        }

        //Monuments Status
        if (airNation.getMonuments().size() == 0) {
            sb.append("Monuments: None").append(System.lineSeparator());
        } else {
            sb.append("Monuments:").append(System.lineSeparator());
            for (Monuments monuments : airNation.getMonuments()) {
                sb.append(monuments.toString());
            }
        }

        return sb.toString();
    }
}
