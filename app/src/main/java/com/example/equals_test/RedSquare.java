package com.example.equals_test;

public class RedSquare extends Square {

    public RedSquare(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        super(topLeft, topRight, bottomLeft, bottomRight);
    }


    public static RedSquare createSampleData() {
        return new RedSquare(new Point(1, 2), new Point(2, 3), new Point(3, 4), new Point(4, 4));
    }

    //RedSquare - topLeft : (1, 2), topRight : (2, 3), bottomLeft : (3, 4), bottomRight : (4, 4)
    @Override
    public String toString() {
        return "RedSquare - " + super.toString();
    }
}
