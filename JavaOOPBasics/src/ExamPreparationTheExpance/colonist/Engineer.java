package ExamPreparationTheExpance.colonist;

public abstract class Engineer extends Colonist {

    protected Engineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPotential() {
       if (super.getAge() > 30){
           return 5;
       } else {
           return 3;
       }
    }
}
