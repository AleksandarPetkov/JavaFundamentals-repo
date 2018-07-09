package Lecture_AbstractionsAndInterfaces.p01_DefineInterfacePerson;

public class Citizen implements  Person {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected Citizen(String name, int age){
        this.name = name;
        this.age = age;
    }
}
