package com.lovemesomecoding.heap;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Step 1 − Insert the newNode as last leaf from left to right.<br>
 * Step 2 − Compare newNode value with its Parent node.<br>
 * Step 4 − If value of parent is less than child, then swap them.<br>
 * Step 5 − Repeat step 2 and step 3 until newNode value is less than its parent node (or) newNode reaches to root.<br>
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MaxHeap {

    private List<Integer> data = new ArrayList<>();

    /**
     * Function to return the position of the parent for the node currently at position
     */
    private int parent(int position) {
        if (position == 0) {
            return 0;
        }
        return (position - 1) / 2;
    }

    /**
     * Function to return the position of the left child for the node currently at position
     */
    private int left(int position) {
        return (2 * position) + 1;
    }

    /**
     * Function to return the position of the right child for the node currently at position
     */
    private int right(int position) {
        return (2 * position) + 2;
    }

    private void swap(int firstPosition, int secondPosition) {
        System.out.println("firstPosition: " + firstPosition + ", data: " + this.data.get(firstPosition) + ", secondPosition: " + secondPosition + ", data: " + this.data.get(secondPosition));
        int tmp = this.data.get(firstPosition);
        this.data.set(firstPosition, this.data.get(secondPosition));
        this.data.set(secondPosition, tmp);
        System.out.println("firstPosition: " + firstPosition + ", data: " + this.data.get(firstPosition) + ", secondPosition: " + secondPosition + ", data: " + this.data.get(secondPosition));

    }

    public void add(int item) {
        this.data.add(item);

        // increase the size of an array Heap[++size] = element;
        int current = getSize() - 1;

        System.out.println("adding: " + item + " to position: " + current);

        heapifyUp(current);
    }

    public int peek() {
        return data.get(0);
    }

    /**
     * Swap the root node with last node in max heap<br>
     * Step 2 - Delete last node.<br>
     * Step 3 - Now, compare root value with its left child value.<br>
     * Step 4 - If root value is smaller than its left child, then compare left child with its right sibling. Else goto
     * Step 6<br>
     * Step 5 - If left child value is larger than its right sibling, then swap root with left child otherwise swap root
     * with its right child.<br>
     * Step 6 - If root value is larger than its left child, then compare root value with its right child value.<br>
     * Step 7 - If root value is smaller than its right child, then swap root with right child otherwise stop the
     * process.<br>
     * Step 8 - Repeat the same until root node fixes at its exact position.<br>
     */
    public int poll() {
        int head = data.get(0);

        // swap root node with last element
        data.set(0, this.data.get(getSize() - 1));
        
        // delete last node(previous root node)
        data.remove(getSize() - 1);
        
        // call heapify-down on the root node
        heapifyDown(0);

        return head;
    }

    /**
     * Step 1 − Insert the newNode as last leaf from left to right.<br>
     * Step 2 − Compare newNode value with its Parent node.<br>
     * Step 4 − If value of parent is less than child, then swap them.<br>
     * Step 5 − Repeat step 2 and step 3 until newNode value is less than its parent node (or) newNode reaches to
     * root.<br>
     */
    private void heapifyUp(int position) {
        int temp = this.data.get(position);

        if (position > 0 && temp > this.data.get(parent(position))) {
            System.out.println("heapifyUp - position: " + position + ", data: " + this.data.get(parent(position)));
            // swap the two if heap property is violated
            swap(position, parent(position));

            // call heapify-up on the parent
            heapifyUp(parent(position));
        }
    }

    /**
     * Step 1 − Remove root node.<br>
     * Step 2 − Move the last element of last level to root.<br>
     * Step 3 − Compare the value of this child node with its parent.<br>
     * Step 4 − If value of parent is less than child, then swap them.<br>
     * Step 5 − Repeat step 3 & 4 until Heap property holds.<br>
     */
    private void heapifyDown(int position) {

        int largest = position;
        int leftChild = left(position);
        int rightChild = right(position);

        int size = getSize();

        /**
         * compare parent with its left and right child and find the largest value
         */
        if (leftChild < size && this.data.get(largest) < this.data.get(leftChild)) {
            largest = leftChild;
        }

        if (rightChild < size && this.data.get(largest) < this.data.get(rightChild)) {
            largest = rightChild;
        }

        if (largest != position) {

            // swap with a child having greater value
            swap(position, largest);

            // call heapify-down on the child
            heapifyDown(largest);
        }
    }

    public void print() {
        System.out.println("\nList");
        for (Integer d : data) {
            System.out.println("data: " + d);
        }
        System.out.println("\nTree");
        System.out.println("Root: " + data.get(0));
        for (int i = 1; i <= getSize() / 2; i++) {

            try {
                System.out.print("Parent: " + this.data.get(i - 1));
            } catch (Exception e) {

            }

            try {
                System.out.print(", Left: " + this.data.get(this.left(i - 1)));
            } catch (Exception e) {

            }

            try {
                System.out.print(", Right: " + this.data.get((this.right(i - 1))));
            } catch (Exception e) {

            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public int getSize() {
        return this.data.size();
    }

}
