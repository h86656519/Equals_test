package com.example.equals_test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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
        Point p1 = new Point(1, 1);
        Point p2 = new Point3D(1, 1, 1);
        Point p3 = new Point(1,1);

        //equals hashcode
        HashSet pSet = new HashSet();
        HashMap map = new HashMap();
        //equals, no hashcode
        ArrayList pList = new ArrayList<Point>();
        pList.add(p1);
        pSet.add(p1);

        //first~last
        //table key value
        // 10000 -> List[10000]
        // fejlkf.toHashCode() -> Int
        // abc -> 567   List[567]
        // hash table

        System.out.println(pSet.contains(p3));
        System.out.println(pList.contains(p3));
    }
}