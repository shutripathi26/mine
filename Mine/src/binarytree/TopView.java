package binarytree;

import java.util.Map;
import java.util.TreeMap;

class PairTop<U, V> {

	public final U data;
	public final V level;

	public PairTop(U data, V level) {
		this.data = data;
		this.level = level;
	}

	public static <U, V> PairTop<U, V> of(U data, V level) {
		return new PairTop(data, level);
	}
}

public class TopView {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);

		printTop(root);
	}

	public static void printTop(Node root) {
		Map<Integer, PairTop<Integer, Integer>> map = new TreeMap<Integer, PairTop<Integer,Integer>>();
		
		topTravesal(root, 0 , 0 , map);
		
		for(PairTop<Integer, Integer> value : map.values()) {
			System.out.print(value.data + "  ");
		}
	}

	private static void topTravesal(Node node, int dist, int level, Map<Integer, PairTop<Integer, Integer>> map) {

		if (node == null)
			return;

		if (!map.containsKey(dist) || level <= map.get(dist).level) {
			map.put(dist, PairTop.of(node.data, level));
		}

		topTravesal(node.left, dist - 1, level + 1, map);
		topTravesal(node.right, dist + 1, level + 1, map);

	}

}
