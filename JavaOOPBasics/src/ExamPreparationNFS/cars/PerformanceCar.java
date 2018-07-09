package ExamPreparationNFS.cars;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = new ArrayList<>();
    }


    protected void setHorsepower(int horsepower){
        horsepower = horsepower + ((horsepower*50)/100);
        super.setHorsepower(horsepower);
    }

    protected void setSuspension(int suspension){
        suspension = suspension - ((suspension*25)/100);
        super.setSuspension(suspension);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (this.addOns.isEmpty()) {
            sb.append("Add-ons: None");
        } else {
            sb.append(String.format("Add-ons: %s", String.join(", ",this.addOns)));
        }
        return sb.toString();
    }

    public List<String> getAddOns() {
        return this.addOns;
    }
}
