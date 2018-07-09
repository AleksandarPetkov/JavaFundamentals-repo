package Lecture_Inheritance.p06_Animals;

public class Animal {
    private String name;
    private int age;
    private String denger;

    public Animal(String name, int age, String denger) {
        setName(name);
        setAge(age);
        setDenger(denger);
    }

    public void setName(String name) {
        if (name.length() < 1 || name == null) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.age = age;
        }
    }

    public void setDenger(String denger) {
        if (denger.equals("Male") || denger.equals("Female")) {
            this.denger = denger;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    protected String produceSound() {
        return "Not implemented!";
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s %d %s", this.name, this.age, this.denger)).append(System.lineSeparator())
                .append(produceSound());

        return sb.toString();
    }
}
