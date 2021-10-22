package com.lovemesomecoding.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(2);
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cantalope");
        
        System.out.println(fruits.toString());
    }

}
