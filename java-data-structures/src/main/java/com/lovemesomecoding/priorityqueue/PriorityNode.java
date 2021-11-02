package com.lovemesomecoding.priorityqueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriorityNode implements Comparable<Integer> {

    private Object data;
    private int    priority;

    @Override
    public int compareTo(Integer other) {
        return Integer.valueOf(priority).compareTo(other);
    }

}
