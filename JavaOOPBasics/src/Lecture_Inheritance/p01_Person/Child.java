package Lecture_Inheritance.p01_Person;

public class Child extends Person {

    public Child(String name, int age){
        super(name , age);
    }

    public void setAge(int age){
        if (age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        } else {
           super.setAge(age);
        }
    }

}
