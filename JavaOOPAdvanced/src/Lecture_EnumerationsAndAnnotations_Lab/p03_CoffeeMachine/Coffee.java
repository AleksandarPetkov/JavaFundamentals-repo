package Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine;

import Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine.enums.CoffeeSize;
import Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine.enums.CoffeeType;

public class Coffee {
    private CoffeeSize coffeeSize;
    private CoffeeType coffeeType;

    public Coffee(String coffeeSize, String coffeeType) {
        this.coffeeSize = Enum.valueOf(CoffeeSize.class, coffeeSize.toUpperCase());
        this.coffeeType = Enum.valueOf(CoffeeType.class, coffeeType.toUpperCase());
    }

    public int getPrice(){
        return coffeeSize.getPrice();
    }

    @Override
    public String toString() {
        return this.coffeeSize +" "+ this.coffeeType+" sold";
    }
}
