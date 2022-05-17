package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV5PzOCKAigDFAUq&probBoxId=AX7COOJKKQADFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0204&problemBoxCnt=4
public class D2_2001_파리퇴치 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D2_2001_파리퇴치.txt"));
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = in.nextInt();
			int M = in.nextInt();
			int[][] arr = new int[N][N];
			int max = 0;
			
			
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = in.nextInt();
				}
			}
			
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int sum = 0;
					for (int k = 0; k < M; k++) {
						for (int l = 0; l < M; l++) {
							sum += arr[i + k][j + l];
						}
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, max);
			
		}
	}

}
