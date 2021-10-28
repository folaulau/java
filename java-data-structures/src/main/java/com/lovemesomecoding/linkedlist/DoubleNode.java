package com.lovemesomecoding.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class DoubleNode {

    private DoubleNode prev;
    private Customer   data;
    private DoubleNode next;

    public DoubleNode(Customer data) {
        this(null, data, null);
    }
}
