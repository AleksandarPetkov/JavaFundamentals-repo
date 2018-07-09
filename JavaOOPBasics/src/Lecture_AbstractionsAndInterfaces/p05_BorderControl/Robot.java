package Lecture_AbstractionsAndInterfaces.p05_BorderControl;

public class Robot implements InterfaceImpl {
    private String model;
    private String id;

    protected Robot(String model, String id) {
        this.model = model;
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
