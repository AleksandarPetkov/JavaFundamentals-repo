package Lecture_OpenClosedLiskovPrinciples_Lab.p04_DetailPrinter;

import java.util.ArrayList;

public class DetailsPrinter {

    private Iterable<Employee> employees;

    public DetailsPrinter(Iterable<Employee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("George"));
        employees.add(new Manager("Avram", new ArrayList<>()));

        DetailsPrinter detailsPrinter = new DetailsPrinter(employees);
        detailsPrinter.printDetails();
    }
}
