package com.lovemesomecoding.linkedlist;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MySingleLinkedList {

    int          size = 0;

    private Node head;

    public MySingleLinkedList(Node head) {
        append(head);
    }

    /**
     * add to end of list
     */
    public void append(Node node) {
        if (node == null) {
            return;
        }
        if (this.head == null) {
            this.head = node;
        } else {
            Node currentNode = this.head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        size++;
    }

    /**
     * append to front of list
     */
    public void prepend(Node node) {
        if (node == null) {
            return;
        }
        if (this.head == null) {
            this.head = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
        size++;
    }

    /**
     * add at position of list
     */
    public void add(int index, Node node) {
        if (node == null) {
            return;
        }

        int count = 0;

        Node previous = null;
        Node currentNode = this.head;

        while (currentNode.getNext() != null) {

            if (index == count) {
                break;
            }

            previous = currentNode;
            currentNode = currentNode.getNext();

            count++;

        }

        if (this.head.equals(currentNode)) {
            /*
             * adding to the head
             */
            node.setNext(currentNode);
            this.head = node;
        } else {
            node.setNext(currentNode);
            previous.setNext(node);
        }

        size++;
    }

    /**
     * is empty?
     */
    public boolean isEmpty() {
        return size <= 0 || this.head == null;
    }

    /**
     * exist? search by email
     */
    public boolean existByEmail(String email) {
        if (email == null || email.length() <= 0) {
            return false;
        }
        if (this.head == null) {
            return false;
        } else {
            Node currentNode = this.head;

            /**
             * if email not found, keep checking the next node<br>
             * when email is found, break out of while loop
             */
            while (!currentNode.getData().getEmail().equalsIgnoreCase(email.toLowerCase())) {

                /**
                 * next is null, so email is not found
                 */
                if (currentNode.getNext() == null) {
                    return false;
                }

                currentNode = currentNode.getNext();
            }
            return true;
        }

    }

    /**
     * get node on index
     */
    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of bounds");
        }
        if (index == 0) {
            return this.head;
        }

        int count = 0;

        Node currentNode = this.head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();

            count++;

            if (index == count) {
                break;
            }

        }
        return currentNode;

    }

    /**
     * remove node base on index
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of bounds");
        }

        int count = 0;

        Node previous = null;
        Node currentNode = this.head;
        Node next = null;

        while (currentNode.getNext() != null) {

            if (index == count) {
                break;
            }

            previous = currentNode;
            currentNode = currentNode.getNext();
            next = currentNode.getNext();

            count++;

        }

        if (currentNode.equals(this.head)) {
            this.head = this.head.getNext();
        } else {
            previous.setNext(next);
        }

    }
    
    /**
     * remove all<br>
     * set head to null
     */
    
    public void removeAll() {
        this.head = null;
    }

    /**
     * print out list
     */

    public void printList() {
        if (this.head == null) {
            System.out.println("list is empty");
        }

        Node node = this.head;
        while (node != null) {
            System.out.println("data: " + node.getData().toString());
            node = node.getNext();

            if (node == null) {
                System.out.println("end of list");
            }
        }
    }
}
