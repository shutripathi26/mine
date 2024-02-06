package leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "(){[}]";

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				System.out.println(false);
		}
		System.out.println(stack.isEmpty());
	}
}
