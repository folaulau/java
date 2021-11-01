package com.lovemesomecoding.stack;

import java.util.Stack;

import com.lovemesomecoding.linkedlist.Customer;

public class StackMain {

    public static void main(String[] args) {
        MyStack<Customer> customers = new MyStack<>();
        
        System.out.println("Pushing 3 customers");
        customers.push(new Customer("Folau", "Kaveinga", "folau@gmail.com"));
        customers.push(new Customer("Lisa", "Kaveinga", "lisa@gmail.com"));
        customers.push(new Customer("Laulau", "Kaveinga", "laulau@gmail.com"));
        

        customers.print();
        
        System.out.println("Poping");
        customers.pop();
        //System.out.println(customers.pop().toString());
        
        customers.print();

        Stack<Customer> stack = new Stack<Customer>();
        stack.push(new Customer("Folau", "Kaveinga", "folau@gmail.com"));
        stack.push(new Customer("Lisa", "Kaveinga", "lisa@gmail.com"));
        stack.push(new Customer("Laulau", "Kaveinga", "laulau@gmail.com"));
        
        System.out.println("Polling...");
        System.out.println(stack.pop().toString());
    }
}
