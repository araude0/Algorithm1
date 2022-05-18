package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV14eWb6AAkCFAYD&probBoxId=AX7SQAvKNcUDFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0207&problemBoxCnt=2
public class D4_1218_괄호짝짓기 {

	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D4_1218_괄호짝짓기.txt"));
		Scanner in = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			N = in.nextInt();
			in.nextLine();
			
			Stack<Character> stack = new Stack<Character>();
			String str = in.nextLine();
			int answer = 0;
			for (int i = 0; i < N; i++) {
				char c = str.charAt(i);
				
				if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else if (c == '>' && !stack.isEmpty() && stack.peek() == '<') {
					stack.pop();
				} else {
					stack.add(c);
				}
			}
			
			if (stack.isEmpty()) {
				answer = 1;
			}
			
			System.out.printf("#%d %d\n", tc, answer);
		}
		
	}

}
