package com.lovemesomecoding.queue;

import com.lovemesomecoding.linkedlist.Customer;

public class QueueMain {

    public static void main(String[] args) {
        MyQueue<Customer> queue = new MyQueue<>();
        
        System.out.println("Enqueuing 3 customers");
        queue.enqueue(new Customer("Folau", "Kaveinga", "folau@gmail.com"));
        queue.enqueue(new Customer("Lisa", "Kaveinga", "lisa@gmail.com"));
        queue.enqueue(new Customer("Laulau", "Kaveinga", "laulau@gmail.com"));
        
        queue.print();
        
        System.out.println("Dequeuing...");
        queue.dequeue();
        
        queue.print();

    }

}
