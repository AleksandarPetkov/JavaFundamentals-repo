package ExamPreparationTheExpance.colonist;

//: id (String), familyId (String), talent (int), age (int).
public abstract class Colonist {
    private String id;
    private String familyId;
    private int talent;
    private int age;

    protected Colonist(String id, String familyId, int talent, int age) {
        this.id = id;
        this.familyId = familyId;
        this.talent = talent;
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    public void setAge(int age) {
        this.age += age;
    }

    public int getTalent() {
        return this.talent;
    }

    public int getAge() {
        return this.age;
    }

    public int getPotential(){
        return 0;
    }
}
