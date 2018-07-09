package ExamPreparationTheExpance.colonist;

public class Surgeon extends Medic{

    public Surgeon(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age, sign);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getPotential() {
        return setPotential();
    }

    private int setPotential() {
        int points = 0;
        if (super.getAge() > 25 && super.getAge() < 35){
            points += 2;
        }
        if (super.getSign().equals("precise")){
            points += 3;
        }else if (super.getSign().equals("butcher")){
            points -= 3;
        }

        return super.getPotential() + points;
    }
}
