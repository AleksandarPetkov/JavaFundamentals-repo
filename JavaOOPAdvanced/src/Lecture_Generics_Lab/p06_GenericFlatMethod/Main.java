package Lecture_Generics_Lab.p06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 2, 31, 414, 12);

        List<Double> doubleList = new ArrayList<>();
        Collections.addAll(doubleList, 2.2, 31.11, 4.14, 0.112);

        List<List<? extends Number>> jagget = new ArrayList<>();
        Collections.addAll(jagget, intList, doubleList);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest, jagget);
        System.out.println(dest);



    }
}
