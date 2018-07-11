package Lecture_Generics_Exercises.p10_Threeuple;

public class Tuple <T, E, P>{
    private T item1;
    private E item2;
    private String item3;

    public Tuple(T item1, E item2, P item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = setItem3(item3);
    }

    private  String setItem3(P token) {
        String checker = "";
        if (token.equals("drunk")){
            return checker = "true";
        } else if (token.equals("not")){
            return checker = "false";
        } else {
            return checker = token.toString();
        }
    }

    public T getItem1() {
        return this.item1;
    }

    public E getItem2() {
        return this.item2;
    }

    @Override
    public String toString() {
        return getItem1() +" -> "+ getItem2()+ " -> "+ this.item3;
    }
}
