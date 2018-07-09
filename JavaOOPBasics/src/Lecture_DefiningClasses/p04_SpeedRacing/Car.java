package Lecture_DefiningClasses.p04_SpeedRacing;

public class Car {
    private static final int DEFAULT_START_DISTANCE = 0;

    private String model;
    private double fuelAmount;
    private double fuelCoast;
    private int distanceTraveling;

    public Car(String model, double fuelAmount, double fuelCoast){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCoast = fuelCoast;
        this.distanceTraveling = DEFAULT_START_DISTANCE;
    }

    public void drive(int kilometers){
        if (kilometers * this.fuelCoast > this.fuelAmount){
            throw new  IllegalStateException("Insufficient fuel for the drive");
        } else {
            this.distanceTraveling += kilometers;
            this.fuelAmount -= (kilometers * this.fuelCoast);
        }
    }

    @Override
    public String toString() {
       return String.format("%s %.2f %d", this.model , this.fuelAmount , this.distanceTraveling);
    }
}
