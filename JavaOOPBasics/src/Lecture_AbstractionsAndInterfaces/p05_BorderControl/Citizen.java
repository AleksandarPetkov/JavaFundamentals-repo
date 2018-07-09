package Lecture_AbstractionsAndInterfaces.p05_BorderControl;

public class Citizen implements InterfaceImpl {
    private String name;
    private String age;
    private String id;

    protected Citizen(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean checkId(String currentId) {
        if (this.id.endsWith(currentId)){
            return true;
        } else {
            return false;
        }
    }

    public String getId(){
        return this.id;
    }
}
