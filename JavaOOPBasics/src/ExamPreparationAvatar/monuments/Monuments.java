package ExamPreparationAvatar.monuments;

public abstract class Monuments {
    private String name;

    protected Monuments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getAfiinity();

    @Override
    public String toString() {
        return super.toString();
    }
}
