package Lecture_Generics_Lab.p06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException("No elements in the collection");
        }

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(List<T> elements){
        if (elements.isEmpty()){
            throw new IllegalArgumentException("No elements in the collection");
        }

        T min = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (min.compareTo(elements.get(i)) > 0){
                min = elements.get(i);
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> List<Integer> getNullIndices(List<T> list){

        List<Integer> nullIndices = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                nullIndices.add(i);
            }
        }
        return nullIndices;
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source){
        for (List list : source) {
            destination.addAll(list);
        }
    }
}
