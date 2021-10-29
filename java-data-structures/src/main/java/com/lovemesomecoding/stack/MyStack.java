package com.lovemesomecoding.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyStack<E> {

    private LinkedList<E> list = new LinkedList<>();

    public E push(E item) {
        list.addFirst(item);
        return item;
    }

    public E pop() {
        if (list.size() <= 0) {
            throw new EmptyStackException();
        }
        return list.remove();
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        if (list.size() <= 0) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public void print() {

        int size = getSize();
        int count = 1;
        
        if (count >= size) {
            return;
        }

        E item = list.getFirst();

        while (item != null) {

            System.out.println(item.toString());

            if (count >= size) {
                break;
            }

            item = list.get(count);

            count++;
        }
    }
}
