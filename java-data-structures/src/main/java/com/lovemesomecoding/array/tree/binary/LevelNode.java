package com.lovemesomecoding.array.tree.binary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class LevelNode  implements Comparable<LevelNode> {

    private TreeNode node;
    private Integer level;
    
    @Override
    public int compareTo(LevelNode other) {
        return 0;
    }
}
