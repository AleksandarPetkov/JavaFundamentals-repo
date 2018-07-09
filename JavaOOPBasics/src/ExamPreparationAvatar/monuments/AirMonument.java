package ExamPreparationAvatar.monuments;

public class AirMonument extends Monuments {
    private int airAffinity;

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.airAffinity = airAffinity;
    }

    public int getAirAffinity() {
        return this.airAffinity;
    }


    @Override
    public int getAfiinity() {
        return this.airAffinity;
    }

    //    •	Air Monument: {monumentName}, Air Affinity: {airAffinity}
    @Override
    public String toString() {
        return String.format("###Air Monument: %s, Air Affinity: %d%n", super.getName(), getAirAffinity());
    }
}
