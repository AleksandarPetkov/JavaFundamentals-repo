package Lecture_Inheritance.p02_BookShop;

public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String autor, String title, double price){
       super(autor, title, price);
    }


    @Override
    public double getPrice() {
        return super.getPrice() + super.getPrice() * 0.3;
    }

}
