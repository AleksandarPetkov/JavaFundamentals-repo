package ExamPreparationAvatar.monuments;

public class FireMonument extends Monuments {
    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.fireAffinity = fireAffinity;
    }

    public int getFireAffinity() {
        return this.fireAffinity;
    }

    @Override
    public int getAfiinity() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire Monument: %s, Fire Affinity: %d%n", super.getName(), getFireAffinity());
    }
}
