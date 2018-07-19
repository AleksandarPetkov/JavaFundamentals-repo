package Lecture_EnumerationsAndAnnotations_Lab.p03_CoffeeMachine.enums;

public enum CoffeeSize {
//    Small (50 ml, 50 c), Normal (100 ml, 75 c), Double (200 ml, 100 c)
    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private int ml;
    private int price;

    CoffeeSize(int ml, int price){
        this.ml = ml;
        this.price = price;
    }

    public int getMl() {
        return ml;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + String.valueOf(this.name().substring(1, this.name().length()).toLowerCase());
    }
}
