package binarytree;

class NodePre {
	int data;
	NodePre left, right;

	NodePre(int data) {
		this.data = data;
		left = right = null;
	}

}

public class PreorderTraversal {

	public static void main(String[] args) {

		PreorderTraversal preorderTraversal = new PreorderTraversal();

		NodePre root = new NodePre(1);
		root.left = new NodePre(2);
		root.right = new NodePre(3);
		root.left.left = new NodePre(4);
		root.right.left = new NodePre(5);
		root.right.right = new NodePre(6);
		root.right.left.left = new NodePre(7);
		root.right.left.right = new NodePre(8);

		preorderTraversal.preOrderTraversal(root); // 1 2 4 3 5 7 8 6 
	}

	public void preOrderTraversal(NodePre node) {
		if (node == null)
			return;

		// N L R
		System.out.print(node.data + "  ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);

		
	}

}
