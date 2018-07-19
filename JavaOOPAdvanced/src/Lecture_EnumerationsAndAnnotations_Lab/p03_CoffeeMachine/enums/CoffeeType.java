package Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine.enums;

public enum CoffeeType {
//    Espresso, Latte, Irish
    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString() {
        return this.name().charAt(0) + String.valueOf(this.name().substring(1, this.name().length()).toLowerCase());
    }
}
