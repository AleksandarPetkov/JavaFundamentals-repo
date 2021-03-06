package Lecture_Inheritance.p01_Person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        if (name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age must be positive!");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
       return String.format("Name: %s, Age: %d",this.getName(), this.getAge());
    }
}
