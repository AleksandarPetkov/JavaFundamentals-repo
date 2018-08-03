package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.database;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.BoatEngine;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Repository;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.DuplicateModelException;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions.NonExistentModelException;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.utility.Constants;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoatEngineRepository implements Repository<BoatEngine> {
    private Map<String, BoatEngine> boatEngines;

    public BoatEngineRepository() {
        this.boatEngines = new LinkedHashMap<>();
    }

    @Override
    public void add(BoatEngine item) throws DuplicateModelException {
        if (this.boatEngines.containsKey(item.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.boatEngines.put(item.getModel(), item);
    }

    @Override
    public BoatEngine getItem(String model) throws NonExistentModelException {
        if (!this.boatEngines.containsKey(model)) {
            throw new NonExistentModelException(Constants.NON_EXISTENT_MODEL_MESSAGE);
        }

        return this.boatEngines.get(model);
    }
}
