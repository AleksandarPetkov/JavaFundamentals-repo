package ExamPreparationAvatar.benders;

public class WaterBender extends Benders {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }

    public double getWaterClarity() {
        return this.waterClarity;
    }

    @Override
    public double getBenderTotalPower() {
        return getPower() * waterClarity;
    }

    //    •	Water Bender: {benderName}, Power: {power}, Water Clarity: {waterClarity}
    @Override
    public String toString() {
        return String.format("###Water Bender: %s, Power: %d, Water Clarity: %.2f%n", super.getName(), super.getPower()
                , getWaterClarity());
    }
}
