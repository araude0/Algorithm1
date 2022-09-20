import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        // 큐1의 합: s1, 큐2의 합: s2
        long s1 = 0, s2 = 0, sum;
        
        for (int i : queue1) {
            q1.add(i);
            s1 += i;
        }
        
        for (int i : queue2) {
            q2.add(i);
            s2 += i;
        }
        
        sum = s1 + s2;
        // 총합이 홀수면 두 큐의 합이 같을 수 없다
        if (sum % 2 == 1) return -1;
        sum/=2;
        
        int c1 = 0, c2 = 0;
        while (c1 <= queue1.length * 2 && c2 <= queue2.length) {
            if (s1 == sum) return c1 + c2;
            if (s1 > sum) {
                s1 -= q1.peek();
                s2 += q1.peek();
                q2.add(q1.poll());
                c1++;
            } else {
                s2 -= q2.peek();
                s1 += q2.peek();
                q1.add(q2.poll());
                c2++;
            }
        }
        
        return -1;
    }
}