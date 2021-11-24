package com.lovemesomecoding.hashmap;

public class MyHashMap<K, V> {

    private int             size  = 10;
    private MapNode<K, V>[] array = new MapNode[size];

    public void put(K key, V value) {
        int arrayIndex = hash(key);
        putVal(key, value, arrayIndex);
    }

    private int hash(K key) {
        int a = 20;
        int b = 30;
        int primeNumber = 101;
        int m = size;
        int h = key.hashCode();
        return ((a * h * b) % primeNumber) % m;
    }

    public V get(K key) {
        int arrayIndex = hash(key);
        MapNode<K, V> head = array[arrayIndex];

        if (head == null) {
            return null;
        }

        MapNode<K, V> currentNode = head;

        while (null != currentNode && !currentNode.getKey().equals(key)) {
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            return null;
        } else {
            return currentNode.getValue();
        }
    }

    public void putVal(K key, V val, int arrayIndex) {
        MapNode<K, V> head = array[arrayIndex];
        System.out.println("arrayIndex: " + arrayIndex);

        if (head == null) {
            array[arrayIndex] = head = new MapNode<>(key, val);
        } else {

            MapNode<K, V> currentNode = head;

            MapNode<K, V> prevNode = head;

            while (null != currentNode && !currentNode.getKey().equals(key)) {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }

            if (currentNode == null) {
                currentNode = new MapNode<>(key, val);
                prevNode.setNext(currentNode);
            } else {
                currentNode.setValue(val);
            }

        }

        System.out.println(head.toString());
        System.out.println("\n");

    }
}
