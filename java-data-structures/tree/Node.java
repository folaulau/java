

public class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this(data,null,null);
	}
	
	Node(int data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
