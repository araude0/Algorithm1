import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Softeer_L2_회의실예약 {
	static class Node {
		int sTime;
		int fTime;
		
		public Node(int sTime, int fTime) {
			this.sTime = sTime;
			this.fTime = fTime;
		}
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 회의실 개수
		int M = Integer.parseInt(st.nextToken()); // 배정된 예약 수
		
		String[] name = new String[N];
		for (int i = 0; i < N; i++) {
			name[i] = br.readLine();
		}
		
		Arrays.sort(name);
		
		int[][] room = new int[N][18];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < name.length; j++) {
				if (name[j].equals(str)) {
					for (int k = start; k < end; k++) {
						room[j][k] = 1;
					}
				}
			}
		}
		
		for (int i = 0; i < room.length; i++) {
			System.out.println("Room " + name[i] + ":");
			
			int current = 1;
			int sTime = 0;
			int fTime = 0;
			List<Node> list = new ArrayList<Node>();
			for (int j = 9; j <	18; j++) {
				if (current == 1 && room[i][j] == 0) {
					sTime = j;
					current = 0;
				} else if (current == 0 && room[i][j] == 1) {
					fTime = j;
					current = 1;
					list.add(new Node(sTime, fTime));
				}
			}
			if (current == 0) list.add(new Node(sTime, 18));
			
			if (list.size() > 0) {
				System.out.println(list.size() + " available");
				for (Node node : list) {
					System.out.printf("%02d-%2d\n", node.sTime, node.fTime); // %02d 부족한 자리는 0으로 채움 9 -> 09
				}
			} else {
				System.out.println("Not available");
			}
			System.out.println("-----");
		}
	}

}
