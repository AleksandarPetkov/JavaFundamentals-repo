package Lecture_IteratorsAndComparators_Lab.p03_ComparableBook;
import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book>{
        private int counter;

        @Override
        public boolean hasNext() {
            return counter < books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
