package Lecture_InterfaceSegregationDependencyInversionPrinciples.p01_BoatRacingSimulator.exeptions;

public class NonExistentModelException extends Exception {
    public NonExistentModelException(String message) {
        super(message);
    }
}
