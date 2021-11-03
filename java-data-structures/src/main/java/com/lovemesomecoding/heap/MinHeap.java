package com.lovemesomecoding.heap;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MinHeap {

    private List<Integer> data = new ArrayList<>();

    /**
     * Function to return the position of the parent for the node currently at position
     */
    public int parent(int position) {
        if (position == 0) {
            return 0;
        }
        return (position - 1) / 2;
    }

    /**
     * Function to return the position of the left child for the node currently at position
     */
    public int left(int position) {
        return (2 * position) + 1;
    }

    /**
     * Function to return the position of the right child for the node currently at position
     */
    public int right(int position) {
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

    public int poll() {
        int head = data.get(0);

        // replace the root of the heap with the last element
        data.set(0, this.data.get(getSize() - 1));

        // call heapify-down on the root node
        heapifyDown(0);

        return head;
    }

    public void heapifyUp(int position) {
        int temp = this.data.get(position);

        if (position > 0 && temp < this.data.get(parent(position))) {
            System.out.println("position: " + position + ", data: " + this.data.get(parent(position)));
            // swap the two if heap property is violated
            swap(position, parent(position));

            // call heapify-up on the parent
            heapifyUp(parent(position));
        }
    }

    private void heapifyDown(int position) {

        int smallest = position;
        int leftChild = left(position);
        int rightChild = right(position);

        // compare `A[i]` with its left and right child
        // and find the smallest value
        int size = getSize();

        if (leftChild < size && this.data.get(leftChild) < this.data.get(smallest)) {
            smallest = leftChild;
        }

        if (rightChild < size && this.data.get(rightChild) < this.data.get(smallest)) {
            smallest = rightChild;
        }

        if (smallest != position) {

            // swap with a child having lesser value
            swap(position, smallest);

            // call heapify-down on the child
            heapifyDown(smallest);
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
