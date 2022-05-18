import java.util.*;
import java.io.*;

public class Softeer_L2_금고털이 {

	public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken()); // 배낭 무게
        int N = Integer.parseInt(st.nextToken()); // 귀금속 종류

        int[] arr = new int[N+1];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 금속 무게
            int P = Integer.parseInt(st.nextToken()); // 금속 가격
            arr[P] += M;
        }

        int num = N;
        int total = 0;
        while(W > 0) {
            if(arr[num] > W) {
                total += W * num;
                W -= W;
            } else {
                total += num * arr[num];
                W -= arr[num];
            }
            num--;
        }

        System.out.println(total);
    }

}
