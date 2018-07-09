package Lecture_Polymorphism.p03_wildFarm.factories;

import Lecture_Polymorphism.p03_wildFarm.food.Food;
import Lecture_Polymorphism.p03_wildFarm.food.Meat;
import Lecture_Polymorphism.p03_wildFarm.food.Vegetable;

public class FoodFactory {

    public Food getFoodType(String[] foodInfo) {
        switch (foodInfo[0]) {
            case "Vegetable":
                return new Vegetable(Integer.parseInt(foodInfo[1]), foodInfo[0]);
            case "Meat":
                return new Meat(Integer.parseInt(foodInfo[1]), foodInfo[0]);
            default:
                return null;
        }
    }
}
