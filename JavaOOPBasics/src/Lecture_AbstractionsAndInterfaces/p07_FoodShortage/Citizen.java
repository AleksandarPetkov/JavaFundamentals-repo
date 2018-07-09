package Lecture_AbstractionsAndInterfaces.p07_FoodShortage;

public class Citizen implements Buyer {
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

    public String getName() {
        return name;
    }

    @Override

    public int buyFood() {
        return 10;
    }
}
