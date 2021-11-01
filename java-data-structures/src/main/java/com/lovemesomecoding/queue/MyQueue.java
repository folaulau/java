package com.lovemesomecoding.queue;

import java.util.EmptyStackException;
import java.util.LinkedList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MyQueue<E> {

    private LinkedList<E> list = new LinkedList<>();

    public E enqueue(E item) {
        list.addFirst(item);
        return item;
    }

    public E dequeue() {
        if (list.size() <= 0) {
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    public E peek() {
        if (list.size() <= 0) {
            return null;
        }
        return list.peek();
    }

    public boolean isEmpty() {
        return list.size() <= 0;
    }

    public int getSize() {
        return list.size();
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
