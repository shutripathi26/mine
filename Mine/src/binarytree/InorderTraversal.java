package binarytree;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class InorderTraversal {

	public static void main(String[] args) {
		InorderTraversal inorderTraversal = new InorderTraversal();
		
		// 4 2 1 7 5 8 3 6 
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		inorderTraversal.inOrderTravesal(root);

	}

	public void inOrderTravesal(Node node) {
		if (node == null)
			return;

		inOrderTravesal(node.left);

		System.out.print(node.data + "  ");

		inOrderTravesal(node.right);
	}

}
