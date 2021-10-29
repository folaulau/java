package com.lovemesomecoding.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {
        // runSingleLinkListFunctions();
        // runDoubleLinkListFunctions();

        // removeFromTop();

        // removeFromBottom();
        //
        // removeFromIndex(2);

        removeNode();

        List<Customer> linkedList = new LinkedList<>();
    }

    static void runSingleLinkListFunctions() {
        System.out.println("add header Customer");
        SingleNode head = new SingleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MySingleLinkedList linkedList = new MySingleLinkedList(head);
        linkedList.printList();

        System.out.println("append 2 Customers");
        linkedList.append(new SingleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new SingleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.printList();

        System.out.println("linked list size: " + linkedList.getSize());

        System.out.println("prepend 1 Customer");
        linkedList.prepend(new SingleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("linked list size: " + linkedList.getSize());

        System.out.println("check exist by email");
        boolean emailExist = linkedList.existByEmail(null);
        System.out.println("emailExist: " + emailExist);

        System.out.println("get by index");
        SingleNode n = linkedList.get(2);
        System.out.println("n: " + n.getData().toString());

        n = linkedList.get(3);
        System.out.println("n: " + n.getData().toString());

        System.out.println("Removing item from list");
        linkedList.remove(2);
        linkedList.printList();

        linkedList.add(1, new SingleNode(new Customer("Fusi", "Kaveinga", "fusi@gmail.com")));
        linkedList.printList();

        linkedList.removeAll();
        linkedList.printList();
    }

    static void runDoubleLinkListFunctions() {
        DoubleNode head = new DoubleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList(head);
        linkedList.printList();

        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new DoubleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.printList();

        System.out.println("prepend 1 Customer");
        linkedList.prepend(new DoubleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("Removing Lisa(2) from list");
        linkedList.remove(2);
        linkedList.printList();

        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.printList();

        System.out.println("Removing top from list");
        linkedList.remove(0);
        linkedList.printList();

        linkedList.append(new DoubleNode(new Customer("Nesi", "Kaveinga", "efinau10@gmail.com")));

        linkedList.printList();
        // System.out.println("Adding item at position");
        // linkedList.add(1, new DoubleNode(new Customer("Fusi", "Kaveinga", "fusi@gmail.com")));
        // linkedList.printList();
        //
        // linkedList.removeAll();
        // linkedList.printList();
    }

    static void removeFromTop() {

        DoubleNode head = new DoubleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList(head);
        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new DoubleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.prepend(new DoubleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("Removing top from list");

        linkedList.remove(0);
        linkedList.printList();

    }

    static void removeFromBottom() {

        DoubleNode head = new DoubleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList(head);
        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new DoubleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.prepend(new DoubleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("Removing from bottom of list");

        linkedList.remove(linkedList.getSize() - 1);
        linkedList.printList();

    }

    static void removeFromIndex(int index) {

        DoubleNode head = new DoubleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList(head);
        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new DoubleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.prepend(new DoubleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("Removing from index(" + index + ") of list");

        linkedList.remove(index);
        linkedList.printList();

    }

    static void removeNode() {

        DoubleNode head = new DoubleNode(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList(head);
        linkedList.append(new DoubleNode(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));

        linkedList.append(new DoubleNode(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        
        DoubleNode laulau = new DoubleNode(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com"));

        linkedList.append(laulau);
        
        linkedList.printList();

        System.out.println("Removing " + laulau.getData().toString());

        linkedList.remove(laulau);
        linkedList.printList();

    }
}
