package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.IPrivate;

public class Private extends Soldier implements IPrivate{
    private double salary;

    public Private(String id, String firstName, String lastName, double salary) {
        super(firstName, lastName, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
       return String.format("Name: %s %s Id: %s Salary: %.2f", super.getFirstName(), super.getLastName()
        ,super.getId(), this.salary);
    }
}
