import java.util.*;
import java.io.*;


public class Softeer_L2_바이러스 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long K = Integer.parseInt(st.nextToken()); // 계산 중 int 범위 벗어날 수 있으므로 long
		long P = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// a*b % 1000000007 = a % 1000000007 * b % 1000000007
		// a = 9a1 + r1
		// b = 9b1 + r2
		// a * b = 9(9a1b1 + a1 + b1) r1r2 -> (a * b) % 1000000007 = r1r2
		// a % 1000000007 * b % 1000000007 = r1 * r2
		// 큰 수의 나눗셈 나머지는 각 인수의 나머지의 곱과 같기 떄문에 분해하여 계산
		for (int i = 0; i < N; i++) {
			K = K * P % 1000000007;
		}
		
		System.out.println(K);
	}

}
