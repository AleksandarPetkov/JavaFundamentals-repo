package Lecture_Inheritance.p03_Manking;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("First Name: %s", super.getFirstName())).append(System.lineSeparator())
                .append(String.format("Last Name: %s", super.getLastName())).append(System.lineSeparator())
                .append(String.format("Faculty number: %s", this.facultyNumber)).append(System.lineSeparator());

        return sb.toString();
    }
}
