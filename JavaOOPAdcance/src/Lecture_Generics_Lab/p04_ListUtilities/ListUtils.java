package Lecture_Generics_Lab.p04_ListUtilities;

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
}
