

public class MainTree {

	public static void main(String[] args) {
		Node root = createTree();
		
		TreeTraversal tree = new TreeTraversal();
		
		System.out.println("Tree height: "+tree.getHeightOfTree(root));
		
		System.out.println("inorder: Left, Root, Right");
		tree.inorder(root);
		System.out.println();
		
		System.out.println("preorder: Root, Left, Right");
		tree.preorder(root);
		System.out.println();
		
		System.out.println("postorder: Left, Right, Root");
		tree.postorder(root);
		System.out.println();
		
		System.out.println("levelorder: put nodes into queue and visit them");
		tree.levelorder(root);
		System.out.println();
		
		System.out.println("print leaf nodes");
		tree.printLeafNode(root);
		System.out.println();
	}
	
	public static Node createTree(){
		Node root = new Node(1);
		
		Node nodeLeft = new Node(2);
		Node nodeRight = new Node(3);
		
		Node nodeLeft1 = new Node(4);
		Node nodeLeft2 = new Node(5);
		
		
		Node nodeRight1 = new Node(6);
		Node nodeRight2 = new Node(7);
		
		root.left = nodeLeft;
		root.right = nodeRight;
		
		nodeRight.left = nodeRight1;
		nodeRight.right = nodeRight2;
		
		nodeLeft.left = nodeLeft1;
		nodeLeft.right = nodeLeft2;
		
		
		return root;
	}

}
