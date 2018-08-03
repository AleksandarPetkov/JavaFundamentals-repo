package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions;

public class InsufficientContestantsException extends Exception {
    public InsufficientContestantsException(String message) {
        super(message);
    }
}
