package ExamPreparationTheExpance.colonist;

public class Soldier extends Colonist {
    public Soldier(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPotential() {
        return super.getPotential() + 6;
    }
}
