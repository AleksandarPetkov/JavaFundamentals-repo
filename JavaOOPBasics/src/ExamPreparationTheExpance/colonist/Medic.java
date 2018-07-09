package ExamPreparationTheExpance.colonist;

public abstract class Medic extends Colonist{
    private String sign;

    protected Medic(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age);
        this.sign = sign;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String getSign() {
        return sign;
    }

    @Override
    public int getPotential() {
        return 2;
    }
}
