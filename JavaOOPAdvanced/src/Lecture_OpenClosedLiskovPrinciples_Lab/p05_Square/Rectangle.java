package Lecture_OpenClosedLiskovPrinciples_Lab.p05_Square;

class Rectangle {
    private int m_width;
    private int m_height;

    Rectangle (int width, int height) {
       this.m_width = width;
        this.m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
