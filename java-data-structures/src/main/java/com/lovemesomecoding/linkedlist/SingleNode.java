package com.lovemesomecoding.linkedlist;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class SingleNode {

    private Customer data;
    private SingleNode     next;

    public SingleNode(Customer data) {
        this(data, null);
    }

    public SingleNode(Customer data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

}
