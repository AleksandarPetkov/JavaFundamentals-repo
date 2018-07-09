package Lecture_Polymorphism.p03_wildFarm.implementators;

import Lecture_Polymorphism.p03_wildFarm.abstractions.Mammal;
import Lecture_Polymorphism.p03_wildFarm.food.Food;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if(food.getType().equals("Vegetable")){
            super.setFoodEaten(food.getQuantity());
        }else{
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getAnimalType())
                .append("[")
                .append(super.getAnimalName())
                .append(", ")
                .append(String.format("%s", new DecimalFormat("#.##").format(super.getAnimalWeight())))
                .append(", ")
                .append(super.getLivingRegion())
                .append(", ")
                .append(super.getFoodEaten())
                .append("]")
                .append(System.lineSeparator());

        return sb.toString();
    }

}
