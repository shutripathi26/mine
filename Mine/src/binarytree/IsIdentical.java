package binarytree;

public class IsIdentical {

	public static void main(String[] args) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);

		// construct the second tree
		Node y = new Node(15);
		y.left = new Node(10);
		y.right = new Node(20);
		y.left.left = new Node(8);
		y.left.right = new Node(12);
		y.right.left = new Node(16);
		y.right.right = new Node(25);

		if (new IsIdentical().isIdentical(x, y)) {
			System.out.println("The given binary trees are identical");
		} else {
			System.out.println("The given binary trees are not identical");
		}
	}

	public boolean isIdentical(Node x, Node y) {
		if (x == null && y == null)
			return true;

		if ((x != null && y != null) && (x.data == y.data) && isIdentical(x.left, y.left)
				&& isIdentical(x.right, y.right))
			return true;
		return false;
	}

}
