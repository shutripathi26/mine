package binarytree;

class NodePost {
	int data;
	NodePost left, right;

	public NodePost(int data) {
		this.data = data;
		left = right = null;
	}
}

public class PostorderTraversal {

	public static void main(String[] args) {
		NodePost root = new NodePost(1);
		root.left = new NodePost(2);
		root.right = new NodePost(3);
		root.left.left = new NodePost(4);
		root.right.left = new NodePost(5);
		root.right.right = new NodePost(6);
		root.right.left.left = new NodePost(7);
		root.right.left.right = new NodePost(8);
		
		
		PostorderTraversal postorderTraversal = new PostorderTraversal();
		postorderTraversal.postOrderTraversal(root); // 4  2  7  8  5  6  3  1  
	}

	public void postOrderTraversal(NodePost node) {
		if (node == null)
			return;

		// L R N
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + "  ");
	}

}
