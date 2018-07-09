package Lecture_AbstractionsAndInterfaces.p07_FoodShortage;

public class Rebel implements Buyer{
    private String name;
    private String age;
    private String group;

    public Rebel(String name, String age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    @Override
    public int buyFood() {
        return 5;
    }
}
