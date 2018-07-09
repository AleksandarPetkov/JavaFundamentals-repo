package ExamPreparationTheExpance.colonist;

public class GeneralPractitioner extends Medic {
    public GeneralPractitioner(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
    }

    @Override
    public int getPotential() {
        return setPotential();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    private int setPotential() {
        int points = 0;
        if (super.getAge() > 15){
            points += 1 ;
        }
        if(super.getSign().equals("caring")){
            points += 1;
        } else if(super.getSign().equals("careless")){
            points -= 2;
        }
        return super.getPotential() + points;
    }
}
