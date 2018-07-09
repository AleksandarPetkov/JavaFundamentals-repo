package ExamPreparationAvatar.benders;

public class EarthBender extends Benders {
    private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }

    public double getGroundSaturation() {
        return this.groundSaturation;
    }

    @Override
    public double getBenderTotalPower() {
        return (double)getPower() * groundSaturation;
    }

    //    •	Earth Bender: {benderName}, Power: {power}, Ground Saturation: {groundSaturation}
    @Override
    public String toString() {
        return String.format("###Earth Bender: %s, Power: %d, Ground Saturation: %.2f%n", super.getName(), super.getPower()
                , getGroundSaturation());
    }
}
