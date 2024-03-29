package com.lovemesomecoding.heap;

public class HeapMain {

    public static void main(String[] args) {
        System.out.println("\nMaxHeap");
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(35);

        maxHeap.print();

        maxHeap.add(33);
        maxHeap.add(42);

        maxHeap.print();

        maxHeap.add(10);

        maxHeap.print();

        maxHeap.add(14);
        maxHeap.add(19);
        maxHeap.add(27);
        maxHeap.add(44);
        maxHeap.add(26);
        maxHeap.add(31);

        System.out.println("peek: " + maxHeap.peek());

        maxHeap.print();

        System.out.println("poll: " + maxHeap.poll());

        maxHeap.print();

        System.out.println("\nMinHeap");
        MinHeap minHeap = new MinHeap();
//        minHeap.add(35);
//
//        minHeap.print();
//
//        minHeap.add(33);
//        minHeap.add(42);
//
//        minHeap.print();
//
//        minHeap.add(10);
//
//        minHeap.print();
//
//        minHeap.add(14);
//        minHeap.add(19);
//        minHeap.add(27);
//        minHeap.add(44);
//        minHeap.add(26);
//        minHeap.add(31);
//
//        System.out.println("peek: " + minHeap.peek());
//
//        minHeap.print();
//
//        System.out.println("polling...");
//        System.out.println("poll value: " + minHeap.poll());
//
//        minHeap.print();
        
        minHeap.add(new User("Lau", 35));

        minHeap.print();

        minHeap.add(new User("Kinga", 33));
        minHeap.add(new User("Fusi", 42));

        minHeap.print();

        minHeap.add(new User("Nesi", 10));

        minHeap.print();

        minHeap.add(new User("Melenesi", 14));
        minHeap.add(new User("Lisa", 19));
        minHeap.add(new User("Ati", 27));
        minHeap.add(new User("Aitu", 44));
        minHeap.add(new User("None", 26));
        minHeap.add(new User("Tofa", 31));

        System.out.println("peek: " + minHeap.peek());

        minHeap.print();

        System.out.println("polling...");
        System.out.println("poll value: " + minHeap.poll());

        minHeap.print();
    }

}
