package com.lovemesomecoding.tree.binary;

import com.lovemesomecoding.heap.User;

public class BinaryTreeMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(new User("Folau", 20));
        binaryTree.insert(new User("Lisa", 30));
        binaryTree.insert(new User("Laulau", 15));
        binaryTree.insert(new User("Kinga", 12));
        binaryTree.insert(new User("Fusi", 35));
        binaryTree.insert(new User("Nesi", 34));
        binaryTree.insert(new User("Melenesi", 32));
        
        TreeNode root = binaryTree.getRoot();

        System.out.println("PreOrder Traversal [VISITING-NODE,LEFT,RIGHT]");

        binaryTree.preOrder(root);
        
        System.out.println("\n");

        System.out.println("InOrder Traversal [LEFT,VISITING-NODE,RIGHT]");

        binaryTree.inOrder(root);
        
        System.out.println("\n");

        System.out.println("PostOrder Traversal [LEFT,RIGHT,VISITING-NODE]");

        binaryTree.postOrder(root);
        
        System.out.println("\n");

        System.out.println("Bread-First Search, level by level");
        binaryTree.bfs();
    }

}
