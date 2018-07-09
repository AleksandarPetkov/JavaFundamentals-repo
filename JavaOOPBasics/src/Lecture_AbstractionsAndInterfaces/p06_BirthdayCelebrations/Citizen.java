package Lecture_AbstractionsAndInterfaces.p06_BirthdayCelebrations;

public class Citizen implements InterfaceImpl{
    private String name;
    private String age;
    private String id;
    private String birthday;

    protected Citizen(String name, String age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public boolean checkId(String currentBirthday) {
        if (this.birthday.endsWith(currentBirthday)){
            return true;
        } else {
            return false;
        }
    }

    public String getId(){
        return this.birthday;
    }
}
