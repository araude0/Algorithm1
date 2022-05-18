package com.ssafy.im;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2493
public class BJ_2493 {
	// stack
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// stack = [탑 높이, 인덱스]
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				if (stack.peek()[0] < num) {
					stack.pop();
				} else {
					System.out.print(stack.peek()[1] + " ");
					break;
				}
			}
			
			
			if (stack.isEmpty()) {
				System.out.print("0 ");
			}
			stack.push(new int[] {num, i + 1});
		}
	}

	// for
	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		int[] result = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if(arr[i] < arr[j]) {
					result[i] = j + 1;
					break;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
