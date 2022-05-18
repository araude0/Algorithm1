package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AWT-lPB6dHUDFAVT&probBoxId=AX7SQAvKNcUDFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0207&problemBoxCnt=2
public class D3_5215_햄버거다이어트 {

	static int T, N, L, maxScore;
	static int[][] ingred;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D3_5215_햄버거다이어트.txt"));
		Scanner in = new Scanner(System.in);
		
		T = in.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = in.nextInt();
			L = in.nextInt();
			
			ingred = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				ingred[i][0] = in.nextInt();
				ingred[i][1] = in.nextInt();
			}
			
			combination(0, 0, 0);
			System.out.printf("#%d %d\n", tc, maxScore);
		}	

	}
	
	public static void combination(int cnt, int score, int cal) {
		if (cal > L) {
			return;
		}
		if (cnt == N) {
			maxScore = Math.max(maxScore, score);
			return;
		}
		
		combination(cnt+1, score + ingred[cnt][0], cal + ingred[cnt][1]);
		combination(cnt+1, score, cal);
		
	}

}
