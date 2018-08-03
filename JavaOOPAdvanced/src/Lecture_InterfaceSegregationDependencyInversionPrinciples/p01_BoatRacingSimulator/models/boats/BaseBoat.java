package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.models.boats;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Boat;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Constants;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Validator;

public abstract class BaseBoat implements Boat{
    private String model;

    private int weight;

    protected BaseBoat(String model, int weight) {
        this.setModel(model);
        this.setWeight(weight);
    }

    private void setModel(String model) {
        Validator.validateModelLength(model, Constants.MIN_BOAT_MODEL_LENGTH);
        this.model = model;
    }

    private void setWeight(int weight) {
        Validator.validatePropertyValue(weight, "Weight");
        this.weight = weight;
    }

    protected int getWeight() {
        return this.weight;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
