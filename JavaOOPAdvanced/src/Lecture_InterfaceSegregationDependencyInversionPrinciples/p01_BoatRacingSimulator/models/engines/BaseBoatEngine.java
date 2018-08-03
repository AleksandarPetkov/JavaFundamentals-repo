package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.models.engines;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.BoatEngine;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Constants;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Validator;

public abstract class BaseBoatEngine implements BoatEngine {
    private String model;

    private int cachedOutput;

    protected BaseBoatEngine(String model, int horsepower, int displacement) {
        this.setModel(model);
        this.setCachedOutput(horsepower, displacement);
    }

    private void setModel(String model) {
        Validator.validateModelLength(model, Constants.MIN_BOAT_ENGINE_MODEL_LENGTH);
        this.model = model;
    }

    private void setCachedOutput(int horsepower, int displacement) {
        Validator.validatePropertyValue(horsepower, "Horsepower");
        Validator.validatePropertyValue(displacement, "Displacement");

        this.cachedOutput = this.calculateOutput(horsepower, displacement);
    }

    protected abstract int calculateOutput(int horsepower, int displacement);

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getCachedOutput() {
        return this.cachedOutput;
    }
}
