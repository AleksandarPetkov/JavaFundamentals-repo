package ExamPreparationTheExpance.colonist;

public class HardwareEngineer extends Engineer {

    public HardwareEngineer(String id, String familyId, int talent, int age) {
        super(id, familyId, talent, age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPotential() {
        return  setPotention();
    }

    private int setPotention() {
        if(super.getAge() < 18){
          return  super.getPotential() + 2;
        } else {
            return super.getPotential();
        }
    }
}
