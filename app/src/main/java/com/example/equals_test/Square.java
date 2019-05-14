package com.example.equals_test;

public class Square {

    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    public Point getTopLeft() {
        return topLeft;
    }

    public Square(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public static Square createSampleData() {
        return new Square(new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 4));
    }

    public int SquareArea() {
        int length = topLeft.y - bottomLeft.y;
        int width = bottomRight.x - bottomLeft.x;
        int area = length * width;
        return area;
    }

    // topLeft : (1, 2), topRight : (2, 3), bottomLeft : (3, 4), bottomRight : (4, 4)
    @Override
    public String toString() {
        return "topLeft : " + this.topLeft + "," +
                "topRight :" + this.topRight + ", " +
                "bottomLeft : " + this.bottomLeft + ", " +
                "bottomRight : " + this.bottomRight;
    }
}
