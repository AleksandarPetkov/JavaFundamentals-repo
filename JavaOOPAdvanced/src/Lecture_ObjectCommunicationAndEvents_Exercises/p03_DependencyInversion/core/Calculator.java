package Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.core;

public interface Calculator {
    void changeStrategy(char operator);

    int performCalculation(int firstOperand, int secondOperand);
}
