package com.lovemesomecoding.hashmap;

import java.util.HashMap;
import java.util.Map;

import com.lovemesomecoding.heap.User;
import com.lovemesomecoding.utils.RandomGeneratorUtils;

public class HashMapMain {

    public static void main(String[] args) {

        // Map<String, Integer> map = new HashMap<>();
        // map.put("1", 1);
        // map.put("2", 2);
        // map.put("3", 3);
        //
        // System.out.println(map.get("2"));

        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<Integer, Integer>();

        for(int i = 0;i<100;i++) {
            myHashMap.put(RandomGeneratorUtils.getIntegerWithin(1, 100), RandomGeneratorUtils.getIntegerWithin(1, 100000));
        }
        
//        myHashMap.put(1, 12);
//        myHashMap.put(3, 1);
//        myHashMap.put(1, 10);

        int key = 6;
        System.out.println("key: " + key + ", value: " + myHashMap.get(key));

        key = 3;
        System.out.println("key: " + key + ", value: " + myHashMap.get(key));
        
        MyHashMap<String, User> users = new MyHashMap<>();
        users.put("folau", new User("Folau", 4));
        users.put("lisa", new User("Lisa", 5));
        
        System.out.println(users.get("lisa").toString());
    }

}
