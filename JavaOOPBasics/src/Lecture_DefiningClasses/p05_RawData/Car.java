package Lecture_DefiningClasses.p05_RawData;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tyres> tyres;

    public Car(String model, Engine engine, Cargo cargo, List<Tyres> tyres) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tyres> getTyres() {
        return tyres;
    }

    @Override
    public String toString(){
        return this.getModel();
    }
}
