package Lecture_Inheritance.p02_BookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IOException, IllegalClassFormatException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String title = reader.readLine();
            String author = reader.readLine();
            double price = Double.valueOf(reader.readLine());

            Book book = new Book(title, author, price);

            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(title, author,  price);

            Method[] goldenBookDeclaredMethods =  GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException("Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalArgumentException | IllegalClassFormatException error) {
            System.out.println(error.getMessage());
        }


    }
}
