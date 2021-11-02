package com.lovemesomecoding.priorityqueue;

import java.util.LinkedList;

public class MyPriorityQueueWithArray {

    private int            count    = 0;
    private int            capacity = 10;
    private PriorityNode[] elements = new PriorityNode[capacity];

    public void enqueue(PriorityNode node) {
        if (node == null || node.getData() == null) {
            return;
        }
        System.out.println("node: " + node.toString());
        System.out.println("count: " + count);

        int position = 0;

        if (count == 0) {

            /**
             * tail has the highest priority
             */
            elements[position] = node;

        } else {

            PriorityNode highestNode = elements[position];

            while (highestNode != null && node.getPriority() <= highestNode.getPriority()) {

                position++;
                highestNode = elements[position];

            }

            add(node, position);

        }

        System.out.println("insert position: " + position);
        System.out.println("\n");
        count++;
    }

    private void add(PriorityNode node, int position) {

        if (count == capacity) {
            /*
             * full
             */
            capacity = capacity * 2;
        }

        PriorityNode[] temp = new PriorityNode[capacity];

        int index = 0;
        int lastIndex = count + 1;

        while (index < lastIndex) {

            if (index < position) {
                /**
                 * front
                 */
                temp[index] = elements[index];
            } else if (index == position) {
                /**
                 * middle
                 */
                temp[position] = node;
            } else {
                /**
                 * back
                 */
                temp[index] = elements[index - 1];
            }

            index++;
        }

        elements = temp;
    }

    private void remove(int position) {

        PriorityNode[] temp = new PriorityNode[capacity];

        int index = 0;
        int lastIndex = count + 1;

        while (index < lastIndex) {

            System.out.println("index: " + index + ", lastIndex: " + lastIndex + ", position: " + position);

            if (index < position) {
                /**
                 * front
                 */
                System.out.println("front");
                temp[index] = elements[index];
            } else if (index == position) {
                /**
                 * middle
                 */
                System.out.println("middle");
            } else {
                /**
                 * back
                 */
                System.out.println("back");
                temp[index - 1] = elements[index];
            }
            if (temp[index] != null)
                System.out.println("temp: " + temp[index].toString());

            index++;
            System.out.println("\n");
        }

        elements = temp;
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     */
    public PriorityNode peek() {
        return elements[0];
    }

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */
    public PriorityNode poll() {
        PriorityNode top = elements[0];
        remove(0);
        return top;
    }

    public PriorityNode removeAt(int index) {
        PriorityNode top = elements[index];
        remove(index);
        return top;
    }

    public void print() {
        int index = 0;
        PriorityNode node = elements[0];
        while (node != null && count > index) {
            System.out.println((index + 1) + ". " + node.toString());
            index++;
            node = elements[index];
        }
    }
}
