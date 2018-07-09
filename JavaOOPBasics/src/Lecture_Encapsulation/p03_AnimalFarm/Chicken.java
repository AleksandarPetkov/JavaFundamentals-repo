package Lecture_Encapsulation.p03_AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private double productPerDay;

    public Chicken(String name, int age){
       setName(name);
       setAge(age);
    }

    public void setName(String name){
        if (name == null || name.length() < 1 || name.equals(" ")){
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
           this.name = name;
        }
    }

    public void setAge(int age){
        if (age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }

    public double calculateProductPerDay(int age){
        double eggsPerDay = 0;
        if (age >= 0 && age <= 5){
            eggsPerDay = 2;
        } else if(age >= 6 && age <= 11){
            eggsPerDay = 1;
        } else {
            eggsPerDay = 0.75;
        }

        this.productPerDay = eggsPerDay;
        return this.productPerDay;
    }

    public double getProductPerDay(){
        return productPerDay;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
