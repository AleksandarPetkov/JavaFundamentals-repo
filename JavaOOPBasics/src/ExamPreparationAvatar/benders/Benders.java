package ExamPreparationAvatar.benders;

public abstract class Benders {
    private String name;
    private int power;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    protected Benders(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract double getBenderTotalPower();

    @Override
    public String toString() {
        return super.toString();
    }
}
