package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV5LyE7KD2ADFAXc&probBoxId=AX7COOJKKQADFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0204&problemBoxCnt=4
public class D3_1873_상호의배틀필드 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D3_1873_상호의배틀필드.txt"));
		Scanner in = new Scanner(System.in);
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int dir = 0;
		
		int T = in.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int H = in.nextInt();
			int W = in.nextInt();
			in.nextLine();
			
			char[][] arr = new char[H][W];
			int x = 0;
			int y = 0;
			
			for (int i = 0; i < H; i++) {
				String str = in.nextLine();
				for (int j = 0; j < W; j++) {
					arr[i][j] = str.charAt(j);
					if (arr[i][j] == '<' || arr[i][j] == '^' || arr[i][j] == 'v' || arr[i][j] == '>') {
						x = i;
						y = j;
					}
				}
			}
			
			int actionLen = in.nextInt();
			char[] action = new char[actionLen];
			in.nextLine();
			
			action = in.nextLine().toCharArray();
			
			for (int i = 0; i < actionLen; i++) {
				switch(action[i]) {
				case 'U':
					arr[x][y] = '^';
					if (x - 1 >= 0 && arr[x - 1][y] == '.') {
						arr[x - 1][y] = arr[x][y];
						arr[x][y] = '.';
						x--;
					}
					break;
				case 'D':
					arr[x][y] = 'v';
					if (x + 1 < H && arr[x + 1][y] == '.') {
						arr[x + 1][y] = arr[x][y];
						arr[x][y] = '.';
						x++;
					}
					break;
				case 'L':
					arr[x][y] = '<';
					if (y - 1 >= 0 && arr[x][y - 1] == '.') {
						arr[x][y - 1] = arr[x][y];
						arr[x][y] = '.';
						y--;
					}
					break;
				case 'R':
					arr[x][y] = '>';
					if (y + 1 < W && arr[x][y + 1] == '.') {
						arr[x][y + 1] = arr[x][y];
						arr[x][y] = '.';
						y++;
					}
					break;
				case 'S':
					if (arr[x][y] == '^') {
						dir = 0;
					} else if (arr[x][y] == 'v') {
						dir = 1;
					} else if (arr[x][y] == '<') {
						dir = 2;
					} else {
						dir = 3;
					}
					int nx = x;
					int ny = y;
					while(true) {
						nx += dx[dir];
						ny += dy[dir];
						
						if (0 > nx || nx >= H || 0 > ny || ny >= W || arr[nx][ny] == '#') {
							break;
						}
						
						if (arr[nx][ny] == '*') {
							arr[nx][ny] = '.';
							break;
						}
					}
				}
			}
			
			System.out.printf("#%d ", tc);
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

		}
		
	}

}
