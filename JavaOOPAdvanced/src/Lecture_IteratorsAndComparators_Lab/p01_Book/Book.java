package Lecture_IteratorsAndComparators_Lab.p01_Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int years;
    private List<String> authors;

    public Book(String title, int years, String... authors){
        setTitle(title);
        setYears(years);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getYears() {
        return years;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String... authors) {
        if(authors.length == 0){
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYears(int years) {
        this.years = years;
    }

    @Override
    public int compareTo(Book otherBook) {
        if (this.title.compareTo(otherBook.title) == 0){
            // first Variant:
//            return this.years - otherBook.years;

            // second Variant:
            return Integer.compare(this.years, otherBook.years);
        }
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(this.title).append(" Year: ").append(this.years).append(" Authors: ")
                .append(String.join(", ", this.authors));
        return sb.toString();
    }



}
