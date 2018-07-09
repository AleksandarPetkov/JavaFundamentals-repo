package Lecture_Inheritance.p06_Animals;

public class Tomcat extends Cat {
    protected static String DEFAULT_TYPE = "Tomcat";

    public Tomcat(String name, int age, String denger){
        super(name, age, denger);
    }

    @Override
    protected String produceSound(){
//        super.produceSound(); Need to use?
        return "Give me one million b***h";
    }
}
