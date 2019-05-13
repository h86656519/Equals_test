package com.example.equals_test;

import java.util.Objects;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
}
