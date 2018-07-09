package ExamPreparationTheExpance.colonist;

public class SoftwareEngineer extends Engineer{

    public SoftwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPotential() {
        return setPotention();
    }

    private int setPotention() {
        return super.getPotential() + 2;
    }
}
