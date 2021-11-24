package com.lovemesomecoding.hashmap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class MapNode<K, V> {
    private K             key;
    private V             value;
    private MapNode<K, V> next;

    public MapNode(K key, V value) {
        this(key, value, null);
    }
}
