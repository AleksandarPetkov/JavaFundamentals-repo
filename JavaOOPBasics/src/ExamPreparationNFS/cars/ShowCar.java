package ExamPreparationNFS.cars;

public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stars = 0;
    }

    public void setStars(int tuneIndex) {
       this.stars += tuneIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString())
                .append(String.format("%d *",stars));
        return sb.toString();
    }
}
