package Lecture_OpenClosedLiskovPrinciples_Lab.p03_GraphicEditor;

public class GraphicEditor {

    public void drawShape(Shape shape) {

        // Using Design pattern! No If-else or SwitchCase
        if (shape instanceof Shape) {
            System.out.println("I'm Shape");
        } else if (shape instanceof Circle) {
            System.out.println("I'm Circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("I'm Rectangle");
        }
    }

    static void testDraw(Drawable drawable){
        drawable.draw();
    }

    public static void main(String[] args) {
        Drawable rectange = new Rectangle();
        Drawable circle = new Circle();

        GraphicEditor.testDraw(rectange);
        GraphicEditor.testDraw(circle);
    }
}
