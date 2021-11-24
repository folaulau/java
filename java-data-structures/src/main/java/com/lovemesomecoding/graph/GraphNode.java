package com.lovemesomecoding.graph;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GraphNode implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private int value, weight;
}
