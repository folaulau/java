package com.lovemesomecoding.linkedlist;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Node {

    private Customer data;
    private Node     next;

    public Node(Customer data) {
        this(data, null);
    }

    public Node(Customer data, Node next) {
        this.data = data;
        this.next = next;
    }

}
