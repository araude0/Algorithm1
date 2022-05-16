package com.ssafy.im;

import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV5PobmqAPoDFAUq&probBoxId=AX6vJzRa7nkDFAS2&type=PROBLEM&problemBoxTitle=Problem+box_0203&problemBoxCnt=2
public class D2_1954_달팽이숫자 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] arr;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		for (int tc = 1; tc <= T; tc++) {
			int n = in.nextInt();
			arr = new int[n][n];
			int dir = 0;
			int num = 1;
			int x = 0;
			int y = 0;
			
			for (int i = 0; i < n * n; i++) {
				arr[x][y] = num++;
				int nx = x + dx[dir % 4];
				int ny = y + dy[dir % 4];
				if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
					dir++;
					nx = x + dx[dir % 4];
					ny = y + dy[dir % 4];
				}
				
				x = nx;
				y = ny;
			}
			
			System.out.printf("#%d\n", tc);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
