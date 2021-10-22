package com.lovemesomecoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMain {

    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 25;
        arr[1] = 35;
        arr[2] = 45;
        arr[3] = 53;
        arr[4] = 25;
        arr[5] = 7;

        System.out.println("length: " + arr.length);

        System.out.println(Arrays.toString(arr));

        arr = new int[]{25, 35, 45, 53, 25, 7};
        
        arr[3] = 100;
        
        System.out.println("length: " + arr.length);

        System.out.println(Arrays.toString(arr));
        

        List<Integer> nums = new ArrayList<>();
        nums.set(0, 1);
        nums.set(1, 2);
        nums.set(2, 3);

        nums.set(2, 15);
        
        System.out.println(Arrays.toString(nums.toArray()));

        //demoInsert();
    }

    public static void demoInsert() {

        String[] names = new String[4];
        names[0] = "Folau";
        names[2] = "Lisa";

        System.out.println(Arrays.toString(names));
    }

}
