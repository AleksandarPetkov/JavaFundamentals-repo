package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.database;

import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Boat;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.BoatEngine;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Repository;

public class BoatSimulatorDatabase {
    private Repository<Boat> boats;

    private Repository<BoatEngine> engines;

    public BoatSimulatorDatabase(Repository<Boat> boats, Repository<BoatEngine> engines) {
        this.boats = boats;
        this.engines = engines;
    }

    public Repository<Boat> getBoats() {
        return this.boats;
    }

    public Repository<BoatEngine> getEngines() {
        return this.engines;
    }
}
