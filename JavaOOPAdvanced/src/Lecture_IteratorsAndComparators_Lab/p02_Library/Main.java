package Lecture_IteratorsAndComparators_Lab.p02_Library;

import Lecture_IteratorsAndComparators_Lab.p01_Book.Book;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library<Book> library = new Library<>(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.toString());
        }
    }
}
