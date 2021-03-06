package Lecture_IteratorsAndComparators_Lab.p03_ComparableBook;

import Lecture_IteratorsAndComparators_Lab.p01_Book.Book;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("A", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("A", 2003, "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }

    }

}
