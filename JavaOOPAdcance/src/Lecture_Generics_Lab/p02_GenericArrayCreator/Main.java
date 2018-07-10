package Lecture_Generics_Lab.p02_GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] array = ArrayCreator.create(Integer.class, 5, 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
