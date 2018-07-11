package Lecture_Generics_Exercises.p06_GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T currentValue){
        this.list.add(currentValue);
    }

    public int getCount(T element){
        int counter = 0;
        for (T el : list) {
            if (el.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%s: %s%n",list.get(i).getClass().getName(), list.get(i)));
        }
        return sb.toString();
    }
}
