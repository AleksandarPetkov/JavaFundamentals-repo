package Lecture_Inheritance.p06_Animals;

public class Dog extends Animal {
    protected static String DEFAULT_TYPE = "Dog";

    public Dog(String name, int age, String denger){
        super(name, age, denger);
    }

    @Override
    protected String produceSound(){
//        super.produceSound(); Need to use?
        return "BauBau";

    }

}
