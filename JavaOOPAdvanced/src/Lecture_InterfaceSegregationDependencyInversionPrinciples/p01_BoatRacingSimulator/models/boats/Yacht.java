package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.models.boats;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.BoatEngine;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Race;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Validator;

public class Yacht extends BaseBoat {
    private int cargoWeight;

    private BoatEngine boatEngine;

    public Yacht(String model, int weight, int cargoWeight, BoatEngine boatEngine) {
        super(model, weight);
        this.setCargoWeight(cargoWeight);
        this.boatEngine = boatEngine;
    }

    private void setCargoWeight(int cargoWeight) {
        Validator.validatePropertyValue(cargoWeight, "Cargo Weight");
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateRaceSpeed(Race race) {
        return this.boatEngine.getCachedOutput() - super.getWeight() - this.cargoWeight + (race.getOceanCurrentSpeed() / 2d);
    }

    @Override
    public boolean isMotorBoat() {
        return true;
    }
}
