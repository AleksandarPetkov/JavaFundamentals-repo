package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions;

public class RaceAlreadyExistsException extends Exception {
    public RaceAlreadyExistsException(String message) {
        super(message);
    }
}
