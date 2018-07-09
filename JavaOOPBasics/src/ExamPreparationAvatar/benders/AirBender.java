package ExamPreparationAvatar.benders;

public class AirBender extends Benders {
    private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.aerialIntegrity = aerialIntegrity;
    }

    public double getAerialIntegrity() {
        return this.aerialIntegrity;
    }

    @Override
    public double getBenderTotalPower() {
        return (double)getPower() * getAerialIntegrity();
    }

    //    Air Bender: {benderName}, Power: {power}, Aerial Integrity: {aerialIntegrity}
    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f%n", super.getName(), super.getPower()
                , getAerialIntegrity());
    }
}
