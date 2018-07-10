package Lecture_Generics_Lab.p03_GenericScale;

public class Main {
    public static void main(String[] args) {
        double tomato = 2.4;
        double tomato1 = 1.4;

        Scale<Double> scale = new Scale<>(tomato, tomato1);
        System.out.println(scale.getHeavier());
    }
}
