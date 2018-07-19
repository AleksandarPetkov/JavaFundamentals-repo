package Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine;

import Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine.enums.Coin;
import Lecture_EnumerationsAndAnnotations_Lab.p04_CodingTracker.Author;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMashine {
    private List<Coffee> allCoffies;
    private int coins;

    public CoffeeMashine() {
       this.allCoffies = new ArrayList<>();
    }

    @Author(name = "Petkan")
    public void buyCoffee(String size, String type){
        Coffee coffee = new Coffee(size, type);
        if (coffee.getPrice() <= this.coins){
            this.allCoffies.add(coffee);
            this.coins = 0;
        } else {
            throw new IllegalArgumentException("not enough coins");
        }
    }

    @Author(name = "Asan")
    public void insertCoin(String coin){
        this.coins += Enum.valueOf(Coin.class, coin).getValue();
    }

    @Author(name = "Dragan")
    public Iterable<Coffee> coffeesSold(){
        return this.allCoffies;
    }
}
