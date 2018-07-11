package Lecture_Generics_Lab.p05_NullFinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test with Integers
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1 ,null ,5, null, 777);

        List<Integer> nullCounter = ListUtils.getNullIndices(integers);
        for (Integer position : nullCounter) {
            System.out.println(position);
        }

        // Test with String
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, null,"b" ,"c", "e", null, "q");

        List<Integer> nullCounter1 = ListUtils.getNullIndices(strings);
        for (Integer position : nullCounter1) {
            System.out.println(position);
        }
    }
}
