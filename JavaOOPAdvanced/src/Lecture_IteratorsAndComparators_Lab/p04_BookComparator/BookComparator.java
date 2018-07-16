package Lecture_IteratorsAndComparators_Lab.p04_BookComparator;
import Lecture_IteratorsAndComparators_Lab.p01_Book.Book;
import java.util.Comparator;

public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) == 0){
            return Integer.compare(o1.getYears(), o2.getYears());
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
