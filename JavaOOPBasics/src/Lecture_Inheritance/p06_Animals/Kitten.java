package Lecture_Inheritance.p06_Animals;

public class Kitten extends Cat {
    protected static String DEFAULT_TYPE = "Kitten";

    public Kitten(String name, int age, String denger){
        super(name, age, denger);
    }

    @Override
    protected String produceSound(){
//        super.produceSound(); Need to use?
        return "Miau";
    }
}
