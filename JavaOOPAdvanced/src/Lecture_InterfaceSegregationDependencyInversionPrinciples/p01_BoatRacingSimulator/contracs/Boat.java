package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.contracs;

public interface Boat extends Modelable {
    double calculateRaceSpeed(Race race);

    boolean isMotorBoat();
}
