package Lecture_Inheritance.p06_Animals;

public class Cat extends Animal {

    public Cat(String name, int age, String denger){
        super(name, age, denger);
    }

    @Override
    protected String produceSound(){
//        super.produceSound(); Need to use?
        return "MiauMiau";
    }
}
