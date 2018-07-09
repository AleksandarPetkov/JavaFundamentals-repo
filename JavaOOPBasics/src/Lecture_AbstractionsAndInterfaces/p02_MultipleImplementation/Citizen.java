package Lecture_AbstractionsAndInterfaces.p02_MultipleImplementation;

public class Citizen implements Birthable, Identifiable, Person {
    private String id;
    private String Birthdate ;
    private String name;
    private  int age;


    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        Birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
