package Lecture_Generics_Exercises.p03_GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T currentValue){
        this.list.add(currentValue);
    }

    public void swap(int index1, int index2){
        T currenValue = list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, currenValue);
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
