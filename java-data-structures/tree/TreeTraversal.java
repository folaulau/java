

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
	
	/* Left, Root, Right
	 * 1. Traverse the left subtree, i.e., call inorder(left-subtree)
	 * 2. Visit the root.
	 * 3. Traverse the right subtree, i.e., call inorder(right-subtree)
	 * */
	public void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	/* Root, Left, Right
	 * 1. Visit the root
	 * 2. Traverse the left subtree, i.e., call preorder(left-subtree)
	 * 3. Traverse the right subtree, i.e., call preorder(right-subtree)
	 * */
	public void preorder(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	/* Left, Right, Root
	 * 1. Traverse the left subtree, i.e., call postorder(left-subtree)
	 * 2. Traverse the right subtree, i.e., call postorder(right-subtree)
	 * 3. Visit the root
	 * */
	public void postorder(Node root){
		if(root!=null){
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	/* 
	 * 1. Create a queue and pop nodes into it
	 * 2. visit every node before moving on
	 * */
	public void levelorder(Node root){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}
	
	/* 
	 * 1. Create a queue and pop nodes into it
	 * 2. visit every node before moving on
	 * */
	public void printLeafNode(Node root){
		if(root==null){
			return;
		}else{
			if(root.left == null && root.right == null){
				System.out.print(root.data+" ");
			}
			printLeafNode(root.left);
			printLeafNode(root.right);
			
		}
	}
	
	/* Traverse both sides and choose the tallest branch
	 * */
	public int getHeightOfTree(Node root){
		if(root==null){
			return -1;
		}
		return Math.max(getHeightOfTree(root.left), getHeightOfTree(root.right)) + 1;
	}
}
