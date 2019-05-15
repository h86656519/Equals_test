package com.example.equals_test;

import java.util.Comparator;

public class Square2 implements Comparable<Square2>{

    @Override
    public int compareTo(Square2 o) {
        if (SquareArea() - o.SquareArea() == 0){
            return this.getTopLeft().compareTo(o.getTopLeft());
        }
        return SquareArea() - o.SquareArea();

    }

    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    public Point getTopLeft() {
        return topLeft;
    }

    public Square2(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
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

    public static Comparator<Square> squareCompatornew = new Comparator<Square>(){
        @Override
        public int compare(Square o1, Square o2) {
            if (o1.SquareArea() - o2.SquareArea() == 0){
                return o1.getTopLeft().compareTo(o2.getTopLeft());
            }
            return o1.SquareArea() - o2.SquareArea();
        }
    };

}
