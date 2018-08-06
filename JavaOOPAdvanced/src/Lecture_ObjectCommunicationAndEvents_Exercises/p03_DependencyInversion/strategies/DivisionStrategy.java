package Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.strategies;

public class DivisionStrategy implements Strategy {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }
}
