package Lecture_OpenClosedLiskovPrinciples_Lab.p01_ExtendArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtendArrayList<T extends Comparable<T>> extends ArrayList<T> {

    public static void main(String[] args) {
        ExtendArrayList<Integer> extendArrayList = new ExtendArrayList<>();
        extendArrayList.add(5);
        extendArrayList.add(7);
        extendArrayList.add(56);
        System.out.println(extendArrayList.maxElement());
        System.out.println(extendArrayList.minElement());
    }

    public T maxElement() {

        T max = null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()) {
            T nextElement = iterator.next();
            if (max == null || max.compareTo(nextElement) < 0) {
                max = nextElement;
            }
        }
        return max;
    }

    public T minElement() {

        T min = null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()) {
            T nextElement = iterator.next();
            if (min == null || min.compareTo(nextElement) > 0) {
                min = nextElement;
            }
        }
        return min;
    }
}
