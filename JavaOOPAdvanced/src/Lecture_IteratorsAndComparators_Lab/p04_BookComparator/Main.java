package Lecture_IteratorsAndComparators_Lab.p04_BookComparator;

import Lecture_IteratorsAndComparators_Lab.p01_Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator()); // Sort the books with my custom BookComparator

        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYears());
        }
    }
}
