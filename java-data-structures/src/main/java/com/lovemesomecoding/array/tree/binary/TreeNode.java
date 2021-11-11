package com.lovemesomecoding.array.tree.binary;

import com.lovemesomecoding.heap.User;
import com.lovemesomecoding.linkedlist.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TreeNode implements Comparable<TreeNode> {

    private User data;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(User data) {
        this.data = data;
    }

    @Override
    public int compareTo(TreeNode other) {
        // TODO Auto-generated method stub
        return this.data.compareTo(other.getData());
    }
}
