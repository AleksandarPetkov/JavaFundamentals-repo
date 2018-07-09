package Lecture_Inheritance.p06_Animals;

public class Frog extends Animal{
    protected String DEFAULT_TYPE = "Frog";

    public Frog(String name, int age, String denger){
        super(name, age, denger);
    }

    @Override
    protected String produceSound(){
//        super.produceSound(); Need to use?
        return "Frogggg";

    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
