package ExamPreparationNFS.cars;

import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;

    protected Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsepower(horsepower);
        this.acceleration = acceleration;
        this.setSuspension(suspension);
        this.durability = durability;
    }

    protected void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

    protected void setSuspension(int suspension){
        this.suspension = suspension;
    }

    public void setHorsepowerByTune(int tuneIndex){
        this.horsepower += tuneIndex;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    public int getDurability() {
        return durability;
    }

    public void setSuspensionByTune(int tuneIndex){
        this.suspension += (tuneIndex / 2);
    }

    public List<String> getAddOns(){
        return null;
    }

    public void setStars(int tuneIndex){
         return;
    }

    @Override
    public String toString() {
        StringBuilder car = new StringBuilder();
        car.append(String.format("%s %s %d", this.brand, this.model, this.yearOfProduction))
                .append(System.lineSeparator())
                .append(String.format("%d HP, 100 m/h in %d s",this.horsepower, this.acceleration))
                .append(System.lineSeparator())
                .append(String.format("%d Suspension force, %d Durability", this.suspension, this.durability))
                .append(System.lineSeparator());
        return car.toString();
    }
}
