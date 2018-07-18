package Lecture_IteratorsAndComparators_Exercises.p02_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListyIterator<T> {
    private List<String> list;
    private int index;


    public ListyIterator(String... elements) {
        if (elements.length == 0) {
            this.list = new ArrayList<>();
        }
        this.list = Arrays.asList(elements);
    }


    public boolean hasNext() {
        if (!list.isEmpty()) {
            if (this.index < this.list.size() - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean move() {
        if (hasNext() == true) {
            this.index++;
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (list.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(list.get(index));
        }
    }

    public void printAll() {
        if (list.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(String.join(" ",this.list));
        }
    }
}

