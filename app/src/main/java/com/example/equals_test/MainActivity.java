package com.example.equals_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Point p1 = new Point(1, 1);
//        Point p2 = new Point(1, 1);
//        Log.i(TAG,"" + p1.equals(p2));

        Point p1 = new Point(1, 1);
        Point p2 = new Point3D(1, 1, 1);
        Point p3 = new Point3D(1, 1, 2);
        Log.i(TAG,"" + p1.equals(p2));   // 顯示 true
        Log.i(TAG,"" + p2.equals(p1));// 顯示 false
        Log.i(TAG,"" + p2.equals(p3));// 顯示 false
    }
}
