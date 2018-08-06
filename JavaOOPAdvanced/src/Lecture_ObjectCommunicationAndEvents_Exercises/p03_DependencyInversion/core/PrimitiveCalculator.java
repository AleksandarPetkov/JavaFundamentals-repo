package Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.core;

import Lecture_ObjectCommunicationAndEvents_Exercises.p03_DependencyInversion.strategies.*;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveCalculator implements Calculator {
    private  Map<Character, Strategy> allStrategies;

    private Strategy strategy;

    public PrimitiveCalculator() {
        this.allStrategies = new HashMap<>();
        this.allStrategies.put('+', new AdditionStrategy());
        this.allStrategies.put('-', new SubtractionStrategy());
        this.allStrategies.put('*', new MultiplicationStrategy());
        this.allStrategies.put('/', new DivisionStrategy());
        this.strategy = allStrategies.get('+');
    }

    @Override
    public void changeStrategy(char operator) {
        this.strategy = allStrategies.get(operator);
    }

    @Override
    public int performCalculation(int firstOperand, int secondOperand) {
        return this.strategy.calculate(firstOperand, secondOperand);
    }
}
