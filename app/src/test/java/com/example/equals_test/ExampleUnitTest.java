package com.example.equals_test;

import android.widget.LinearLayout;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void hashSetTest() {
//        Point p1 = new Point(1, 1);
//        Point p2 = new Point3D(1, 1, 1);
//        Point p3 = new Point(1, 1);
//
//        //equals hashcode
//        HashSet pSet = new HashSet();
//        HashMap map = new HashMap();
//        //equals, no hashcode
//        ArrayList pList = new ArrayList<Point>();
//        pList.add(p1);
//        pSet.add(p1);
//
//        //first~last
//        //table key value
//        // 10000 -> List[10000]
//        // fejlkf.toHashCode() -> Int
//        // abc -> 567   List[567]
//        // hash table
//
//        System.out.println(pSet.contains(p3));
//        System.out.println(pList.contains(p3));

        final List<Point> p = new ArrayList<>();
        p.add(new Point(1, 1));
        p.add(new Point(3, 6));
        p.add(new Point(3, 2));
        p.add(new Point(2, 1));

        System.out.println(p);

        Collections.sort(p,Point.getComparator);

        for (Point pp : p)
            System.out.println(pp.toString());
    }

    @Test
    public void squareTest() {
        System.out.println("SquareTest");
        Square square = Square.createSampleData();
        RedSquare redSquare = RedSquare.createSampleData();
//        System.out.println(square.toString());
//        System.out.println(redSquare);

        //面積比較  topLeft, topRight, bottomLeft, bottomRight
        final List<Square> s = new ArrayList<>();
        s.add(new Square(new Point(2, 7), new Point(5, 7), new Point(2, 3), new Point(5, 3))); //12
        s.add(new Square(new Point(1, 6), new Point(4, 6), new Point(1, 2), new Point(4, 2))); //12
        s.add(new Square(new Point(1, 5), new Point(3, 4), new Point(1, 2), new Point(3, 2))); //6
        s.add(new Square(new Point(1, 4), new Point(4, 4), new Point(1, 2), new Point(4, 2))); //6
        s.add(new Square(new Point(1, 5), new Point(4, 5), new Point(1, 2), new Point(4, 2))); //9

        Collections.sort(s, Square.SquareComparator);

        for (Square ss : s) {
            System.out.println(ss.SquareArea());
            System.out.println(ss.getTopLeft());
        }

    }

    @Test
    public void name() {
        System.out.println("PointTest");

        Point point1 = new Point(1, 2);
        Point point4 = new Point(5, 8);
        Point point3 = new Point(5, 2);
        Point point2 = new Point(3, 1);

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(points);
    }
}