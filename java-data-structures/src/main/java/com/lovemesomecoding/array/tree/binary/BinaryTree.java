package com.lovemesomecoding.array.tree.binary;

import java.util.PriorityQueue;

import com.lovemesomecoding.heap.User;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class BinaryTree {

    private TreeNode                root;

    private PriorityQueue<LevelNode> queue = new PriorityQueue<>();

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode insert(TreeNode parent, User data) {
        /**
         * if node is null, put the data there
         */
        if (parent == null) {
            return new TreeNode(data);
        }

        User parentData = parent.getData();

        /**
         * if parent is greater than new node, go left<br>
         * if parent is less than new node, go right<br>
         */
        if (parentData.getRating() > data.getRating()) {
            parent.setLeft(insert(parent.getLeft(), data));
        } else {
            parent.setRight(insert(parent.getRight(), data));
        }

        return parent;
    }
    
    public TreeNode insert(User data) {
        if(root==null) {
            root = new TreeNode(data);
            return root;
        }
        return insert(root,data);
    }

    /**
     * 1. Visit the root.<br>
     * 2. Traverse the left subtree in Preorder.<br>
     * 3. Traverse the right subtree in Preorder.<br>
     * Time Complexity: O(n). Space Complexity: O(n).
     */
    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData().toString());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    /**
     * 1. Traverse the left subtree in Inorder.<br>
     * 2. Visit the root.<br>
     * 3. Traverse the right subtree in Inorder.<br>
     * Time Complexity: O(n). Space Complexity: O(n).<br>
     */
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getData().toString());
            inOrder(node.getRight());
        }
    }

    /**
     * 1. Traverse the left subtree in Postorder.<br>
     * 2. Traverse the right subtree in Postorder.<br>
     * 3. Visit the root.<br>
     * Time Complexity: O(n). Space Complexity: O(n).<br>
     */
    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData().toString());
        }
    }

    public void bfs() {

        int level = 1;
        queue.add(new LevelNode(root, level));

        while (queue.isEmpty() != true) {
            LevelNode levelNode = queue.poll();
            TreeNode node = levelNode.getNode();
            
            level++;
            
            // 1. process node
            System.out.println("level: "+levelNode.getLevel()+", data: "+ node.getData().toString());
            
            // 2. push left and right child nodes onto queue
            if(node.getLeft()!=null) {
                queue.add(new LevelNode(node.getLeft(), level));
            }
            
            if(node.getRight()!=null) {
                queue.add(new LevelNode(node.getRight(), level));
            }
            
        }
    }

}
