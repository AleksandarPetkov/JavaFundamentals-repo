package Lecture_Inheritance.p02_BookShop;

public class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price){
        setAuthor(author);
        setTitle(title);
        setPrice(price);
    }

    private void setAuthor(String author){
        String[] tokens = author.split(" ");

        if (tokens.length == 2){
            char firstLetters = tokens[1].charAt(0);
            if (Character.isDigit(firstLetters)){
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    private void setTitle(String title){
        if (title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        } else {
            this.title = title;
        }

    }

    private void setPrice(double  price){
        if (price <= 0){
            throw new IllegalArgumentException("Price not valid!");
        } else {
            this.price = price;
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
