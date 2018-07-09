package Lecture_AbstractionsAndInterfaces.p06_BirthdayCelebrations;

public class Pet implements InterfaceImpl{
    private String name;
    private  String brithdayh;
    private String id;

    public Pet(String name, String brithdayh, String id) {
        this.name = name;
        this.brithdayh = brithdayh;
        this.id = id;
    }

    public boolean checkId(String currentBirthday) {
        if (this.brithdayh.endsWith(currentBirthday)){
            return true;
        } else {
            return false;
        }
    }
    public String getId(){
        return this.brithdayh;
    }
}
