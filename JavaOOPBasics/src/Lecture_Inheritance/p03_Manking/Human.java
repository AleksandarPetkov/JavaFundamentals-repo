package Lecture_Inheritance.p03_Manking;

public class Human {
    private String firstName;
    protected String lastName;

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (Character.isLowerCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        } else if (firstName.length() < 4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        } else {
            this.firstName = firstName;
        }
    }

    protected void setLastName(String lastName){
        if (Character.isLowerCase(lastName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        } else if (lastName.length() >= 3){
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
    }
}
