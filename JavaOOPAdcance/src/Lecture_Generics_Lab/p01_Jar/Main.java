package Lecture_Generics_Lab.p01_Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();
        jar.add(1);
        jar.add(5);
        jar.add(10);
        System.out.println(jar.remove());

        Jar<String> jar1 = new Jar<>();
        jar1.add("a");
        jar1.add("b");
        jar1.add("c");
        System.out.println(jar1.remove());
    }
}
