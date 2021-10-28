package com.lovemesomecoding.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        Node head = new Node(new Customer("Folau", "Kaveinga", "folaudev@gmail.com"));
        MySingleLinkedList linkedList = new MySingleLinkedList(head);
        linkedList.printList();

        linkedList.append(new Node(new Customer("Lisa", "Kaveinga", "efinau10@gmail.com")));
        linkedList.append(new Node(new Customer("Laulau", "Kaveinga", "folauetau@gmail.com")));
        linkedList.printList();

        System.out.println("linked list size: " + linkedList.getSize());

        linkedList.prepend(new Node(new Customer("Kinga", "Kaveinga", "kinga@gmail.com")));
        linkedList.printList();

        System.out.println("linked list size: " + linkedList.getSize());

        boolean emailExist = linkedList.existByEmail(null);
        System.out.println("emailExist: " + emailExist);

        Node n = linkedList.get(2);
        System.out.println("n: " + n.toString());

        n = linkedList.get(3);
        System.out.println("n: " + n.toString());

        System.out.println("Removing item from list");
        linkedList.remove(2);
        linkedList.printList();
        
        linkedList.add(1, new Node(new Customer("Fusi", "Kaveinga", "fusi@gmail.com")));
        linkedList.printList();
        
        linkedList.removeAll();
        linkedList.printList();
    }
}
