package ExamPreparationAvatar.benders;

public class FireBender extends Benders {
    private double heatAggression;

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
        this.heatAggression = heatAggression;
    }

    public double getHeatAggression() {
        return this.heatAggression;
    }

    @Override
    public double getBenderTotalPower() {
        return getPower() * heatAggression;
    }

    //    •	Fire Bender: {benderName}, Power: {power}, Heat Aggression: {heatAggression}
    @Override
    public String toString() {
        return String.format("###Fire Bender: %s, Power: %d, Heat Aggression: %.2f%n", super.getName(), super.getPower()
                , getHeatAggression());
    }
}
