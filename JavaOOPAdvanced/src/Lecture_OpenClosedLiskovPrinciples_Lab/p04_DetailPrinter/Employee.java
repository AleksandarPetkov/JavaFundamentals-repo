package Lecture_OpenClosedLiskovPrinciples_Lab.p04_DetailPrinter;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }


    @Override
    public String toString() {
        return String.format("Employee %s",this.name);
    }
}
