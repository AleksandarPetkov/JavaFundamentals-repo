package Lecture_OpenClosedLiskovPrinciples_Lab.p03_GraphicEditor;

public abstract class Shape implements Drawable{

    @Override
    public void draw() {
        System.out.println("I'm Shape");
    }
}
