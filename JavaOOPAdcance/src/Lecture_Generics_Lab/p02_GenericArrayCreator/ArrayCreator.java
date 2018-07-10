package Lecture_Generics_Lab.p02_GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator<T> {

    public static <T> T[] create(int lenght, T element){
        T[] array = (T[]) new Object[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = element;
        }
        return array;
    }

    public static <T> T[] create(Class<T> tClass, int lenght, T element){
        T[] array = (T[]) Array.newInstance(tClass , lenght);
        for (int i = 0; i < lenght; i++) {
            array[i] = element;
        }
        return array;
    }
}
