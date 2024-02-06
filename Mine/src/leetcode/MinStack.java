package leetcode;

import java.util.Stack;

public class MinStack {
	
	// Declare 2 stacks one simple stack and other stack for maintining min values.
	Stack<Integer> stack;
	Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	public void push(int val) {
		stack.push(val);
		int min = Math.min(minStack.isEmpty()? val : minStack.peek(), val);
		minStack.push(min);
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());// return -3

		minStack.pop();
		System.out.println(minStack.top());// return 0
		System.out.println(minStack.getMin());// return -2
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
 * param_4 = obj.getMin();
 */