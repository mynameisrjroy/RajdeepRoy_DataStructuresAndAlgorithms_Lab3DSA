package com.lab3.ques1;

import java.util.Stack;

public class balancedBrackets {
	public boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char bracket = expression.charAt(i);
			switch (bracket) {
			case ')':
				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				else
					stack.pop();
				break;
			case '}':
				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				else
					stack.pop();
				break;
			case ']':
				if (stack.isEmpty() || stack.peek() != '[')
					return false;
				else
					stack.pop();
				break;
			default:
				stack.push(bracket);
			}
		}

		return stack.isEmpty();
	}
}