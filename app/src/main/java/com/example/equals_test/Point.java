package com.example.equals_test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }


    //        public boolean equals(Point that) {
//        return this.x == that.x && this.y == that.y;
//    }


    @Override
    public boolean equals(Object that) {
        if (that instanceof Point) {
            Point p = (Point) that;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }

    public static int PointComparator(Point o1, Point o2) {
        if (o1.x - o2.x == 0) {
            return o1.y - o2.y;
        }
        return o1.x - o2.x; //大到小
    }

    public int compareTo(Point o2) {
        Point o1 = this;
        if (o1.x - o2.x == 0) {
            return o1.y - o2.y;
        }
        return o1.x - o2.x; //大到小
    }
}
