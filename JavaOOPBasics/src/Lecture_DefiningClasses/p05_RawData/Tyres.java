package Lecture_DefiningClasses.p05_RawData;

public class Tyres {
    private double pressure;
    private int age;

    public Tyres(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }
}
