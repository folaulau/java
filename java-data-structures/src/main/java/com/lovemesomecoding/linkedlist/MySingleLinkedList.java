package com.lovemesomecoding.linkedlist;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MySingleLinkedList {

    int                size = 0;

    private SingleNode head;
    private SingleNode tail;

    public MySingleLinkedList(SingleNode head) {
        append(head);
    }

    /**
     * add to end of list<br>
     * 1. If the Linked List is empty then we simply, add the new Node as the Head of the Linked List.<br>
     * 2. If the Linked List is not empty then we find the last node, and make it' next to the new Node, hence making
     * the new node the last Node.
     * 
     * Time complexity of append is O(n) where n is the number of nodes in the linked list. Since there is a loop from
     * head to end, the function does O(n) work. This method can also be optimized to work in O(1) by keeping an extra
     * pointer to the tail of the linked list.
     */
    public void append(SingleNode node) {
        if (node == null) {
            return;
        }
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        size++;
    }

    /**
     * append to front of list<br>
     * 1. The first Node is the Head for any Linked List.<br>
     * 2. When a new Linked List is instantiated, it just has the Head, which is Null.<br>
     * 3. Else, the Head holds the pointer to the first Node of the List.<br>
     * 4. When we want to add any Node at the front, we must make the head point to it.<br>
     * 5. And the Next pointer of the newly added Node, must point to the previous Head, whether it be NULL(in case of
     * new List) or the pointer to the first Node of the List.<br>
     * 6. The previous Head Node is now the second Node of Linked List, because the new Node is added at the front.<br>
     */
    public void prepend(SingleNode node) {
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
    public void add(int index, SingleNode node) {
        if (node == null) {
            return;
        }

        int count = 0;

        SingleNode currentNode = this.head;

        if (this.head.equals(currentNode)) {
            /*
             * adding to the head
             */
            node.setNext(currentNode);
            this.head = node;

        } else if (this.tail.equals(currentNode)) {

            this.tail.setNext(node);
            this.tail = node;

        }

        SingleNode previous = null;

        while (currentNode.getNext() != null) {

            if (index == count) {
                break;
            }

            previous = currentNode;
            currentNode = currentNode.getNext();

            count++;

        }

        node.setNext(currentNode);
        previous.setNext(node);

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
            SingleNode currentNode = this.head;

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
    public SingleNode get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of bounds");
        }

        if (index == 0) {

            return this.head;

        } else if (index == (size - 1)) {

            return this.tail;

        } else {

            int count = 0;

            SingleNode currentNode = this.head;

            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();

                count++;

                if (index == count) {
                    break;
                }

            }
            return currentNode;
        }

    }

    /**
     * remove node base on index<br>
     * 1. If the Node to be deleted is the first node, then simply set the Next pointer of the Head to point to the next
     * element from the Node to be deleted.<br>
     * 2. If the Node is in the middle somewhere, then find the Node before it, and make the Node before it point to the
     * Node next to it.<br>
     */
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index out of bounds");
        }
        
        if (index==0) {

            this.head = this.head.getNext();
            return;
            
        }

        int count = 1;

        SingleNode previous = this.head;
        SingleNode currentNode = this.head.getNext();
        SingleNode next = null;

        while (count < index) {

            previous = currentNode;
            currentNode = currentNode.getNext();
            next = currentNode.getNext();

            count++;

        }

        if (currentNode.equals(this.tail)) {

            this.tail = previous;
            this.tail.setNext(null);

        } else {
            // drop currentNode
            previous.setNext(next);
        }

    }

    /**
     * remove all<br>
     * set head to null
     */

    public void removeAll() {
        this.head = null;
        this.tail = null;
    }

    /**
     * print out list
     */

    public void printList() {
        if (this.head == null) {
            System.out.println("list is empty");
        }

        int count = 0;
        SingleNode node = this.head;
        while (node != null) {
            System.out.println("index: " + count);
            System.out.println("data: " + node.getData().toString());
            node = node.getNext();

            if (node == null) {
                System.out.println("tail: " + tail.getData().toString());
                System.out.println("end of list\n");
            }

            System.out.println("\n");

            count++;
        }
      
    }
}
