package com.ssafy.pcs;

import java.util.Stack;

public class StackAPITest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.size()+"//"+stack.empty());
		stack.push("송제영");
		stack.push("김태희");
		stack.push("이상훈");

		System.out.println(stack.size()+"//"+stack.empty());
		
		System.out.println(stack.pop());
		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
