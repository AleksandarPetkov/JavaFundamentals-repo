package ExamPreparationNFS;
import ExamPreparationNFS.cars.Car;

import java.util.*;

public class Garage {
    private List<Car> parkedCars;

    public Garage() {
        this.parkedCars = new ArrayList<>();
    }

    public List<Car> getParkedCars() {
        return this.parkedCars;
    }
}
