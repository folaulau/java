package com.lovemesomecoding.priorityqueue;

import com.lovemesomecoding.linkedlist.Customer;

public class PriorityQueueMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyPriorityQueueWithArray prQueueWithArray = new MyPriorityQueueWithArray();
        prQueueWithArray.enqueue(new PriorityNode(new Customer("Folau", "Kaveinga", "folau@gmail.com"), 9));
        prQueueWithArray.enqueue(new PriorityNode(new Customer("Lisa", "Kaveinga", "lisa@gmail.com"), 10));
        prQueueWithArray.enqueue(new PriorityNode(new Customer("Fusi", "Kaveinga", "fusi@gmail.com"), 4));
        prQueueWithArray.enqueue(new PriorityNode(new Customer("Laulau", "Kaveinga", "laulau@gmail.com"), 6));
        prQueueWithArray.enqueue(new PriorityNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com"), 6));

        prQueueWithArray.print();

        prQueueWithArray.poll();

        prQueueWithArray.print();

        prQueueWithArray.removeAt(2);

        prQueueWithArray.print();
    }

}
