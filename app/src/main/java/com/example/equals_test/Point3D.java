package com.example.equals_test;

public class Point3D extends Point {
    public final int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public boolean equals(Object that) {
        if(that instanceof Point3D) {
            Point3D p = (Point3D) that;
            return super.equals(p) && this.z == p.z;
        }
        if(that instanceof Point) {
            return that.equals(this);
        }
        return false;
    }
}