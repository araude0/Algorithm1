package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV139KOaABgCFAYh&probBoxId=AX7COOJKKQADFAVm&type=PROBLEM&problemBoxTitle=Problem+box_0204&problemBoxCnt=4
public class D3_1208_1일차Flatten {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D3_1208_1일차Flatten.txt"));
		Scanner in = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int[] arr = new int[100];
			int dump = in.nextInt();

			for (int i = 0; i < 100; i++) {
				arr[i] = in.nextInt();
			}

			Arrays.sort(arr);
			
			for (int i = 0; i < dump; i++) {
				arr[99]--;
				arr[0]++;
				Arrays.sort(arr);
			}
			
			System.out.printf("#%d %d\n", tc, arr[99] - arr[0]);
		}
		 
	}

}
