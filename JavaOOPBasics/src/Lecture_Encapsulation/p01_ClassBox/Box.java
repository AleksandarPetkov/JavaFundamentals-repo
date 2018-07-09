package Lecture_Encapsulation.p01_ClassBox;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }
//    Volume = lwh
//    Lateral Surface Area = 2lh + 2wh

    public double getSurfaceArea(double lenght, double width, double height) {
        double sum = 0;
        sum = 2 * (lenght * width) + 2 * (lenght * height) + 2 * (width * height);
        return sum;
    }


    public double getLiteralArea(double lenght, double width, double height) {
        double sum = 0;
        sum = 2 * (lenght * height) + 2 * (width * height);
        return sum;
    }

    public double getVolume(double lenght, double width, double height) {
        double sum = 0;
        sum = lenght * width * height;
        return sum;
    }
}
