package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV7GLXqKAWYDFAXB&probBoxId=AX7COOJKKQADFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0204&problemBoxCnt=4
public class D3_2805_농작물수확하기 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D3_2805_농작물수확하기.txt"));
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); 
		
		for (int tc = 1; tc <= T; tc++) {
			int N = in.nextInt();
			in.nextLine();
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String str = in.nextLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int start = Math.abs(N / 2 - i);
				for (int j = start; j < N - start; j++) {
					sum += arr[i][j];
				}
			}
			
			System.out.printf("#%d %d\n", tc, sum);
			
		}
		
	}

}
