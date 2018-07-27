package Lecture_OpenClosedLiskovPrinciples_Lab.p03_GraphicEditor;

public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("I'm Rectangle");
    }
}
