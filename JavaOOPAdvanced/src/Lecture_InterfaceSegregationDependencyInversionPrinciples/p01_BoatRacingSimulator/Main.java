package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator;


import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.*;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs.Runnable;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.controllers.BoatSimulatorControllerImpl;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.core.CommandHandlerImpl;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.core.Engine;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.database.BoatEngineRepository;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.database.BoatRepository;
import Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.database.BoatSimulatorDatabase;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Repository<BoatEngine> boatEngineRepository = new BoatEngineRepository();
        Repository<Boat> boatRepository = new BoatRepository();
        BoatSimulatorDatabase database = new BoatSimulatorDatabase(boatRepository, boatEngineRepository);
        BoatSimulatorController controller = new BoatSimulatorControllerImpl(database);
        CommandHandler commandHandler = new CommandHandlerImpl(controller);
        Engine engine = new Engine(reader, commandHandler);

        engine.run();
    }
}
