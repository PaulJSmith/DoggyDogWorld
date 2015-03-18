package com.example.neon.doggydogworld;

import android.util.Log;

/**
 * Created by neon on 3/16/15.
 */
public class Dog {
    String name;
    int age;
    int numberOfLegs = 4;
    int breed;

    void bark(){
        String bark = name + " barked";
        Log.d("Dog", bark);
    }
}
