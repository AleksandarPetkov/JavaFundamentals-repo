package Lecture_Generics_Exercises.p02_GenericBoxOfInteger;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%s: %d%n",list.get(i).getClass().getName(), list.get(i)));
        }
        return sb.toString();
    }
}
