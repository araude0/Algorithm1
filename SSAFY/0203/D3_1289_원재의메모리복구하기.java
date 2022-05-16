package com.ssafy.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://swexpertacademy.com/main/talk/solvingClub/problemView.do?solveclubId=AX5GfcMaPNIDFASv&contestProbId=AV19AcoKI9sCFAZN&probBoxId=AX6vJzRa7nkDFAS2&type=PROBLEM&problemBoxTitle=Problem+box_0203&problemBoxCnt=2
public class D3_1289_원재의메모리복구하기 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_D3_1289_원재의메모리복구하기.txt"));
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		in.nextLine();
		
		for (int i = 0; i < tc; i++) {
			int count = 0;
			char [] ch = in.nextLine().toCharArray();
			if (ch[0] == '1') {
				count++;
			}
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] != ch[j+1]) {
					count++;
				}
			}
			System.out.printf("#%d %d\n", i+1, count);
		}
	}

}
