package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ISoldier;

public abstract class Soldier implements ISoldier{
    private String firstName;
    private String lastName;
    private String id;

    protected Soldier(String id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
       String str = String.format("Name: %s %s Id: %s", firstName, lastName, id);
       return str;
    }
}
