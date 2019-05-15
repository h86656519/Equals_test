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

//        Collections.sort(p, new Comparator<Point>() {
//            //example
//            @Override
//            public int compare(Point o1, Point o2) {
//                if (o1.x - o2.x == 0) {
//                    return o1.y - o2.y;
//                }
//                return o1.x - o2.x; //大到小
//            }
//        });

        for (Point pp : p)
            System.out.println(pp.toString());
    }

    @Test
    public void squareTest() {
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

        Collections.sort(s, new Comparator<Square>() {
            @Override
            public int compare(Square o1, Square o2) {
                if (o1.SquareArea() - o2.SquareArea() == 0) {
//                    作法一:
//                    if (o1.getTopLeft().x - o2.getTopLeft().x == 0) {
//                        return o1.getTopLeft().x - o2.getTopLeft().x;
//                    }

//                    作法二: static 的做法比較差
//                    int p = Point.PointComparator(o1.getTopLeft(), o2.getTopLeft());
//                    return p;

//                    作法三:
                    return o1.getTopLeft().compareTo(o2.getTopLeft());
                }
                return o1.SquareArea() - o2.SquareArea(); //o1 - o2 = 升冪
//                return o2.SquareArea() - o1.SquareArea();   //降冪
            }
        });

        for (Square ss : s) {
            System.out.println(ss.SquareArea());
            System.out.println(ss.getTopLeft());
        }

    }

    @Test
    public void name() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 2);
        Point point3 = new Point(5, 2);
        Point point4 = new Point(6, 2);

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

    }
}