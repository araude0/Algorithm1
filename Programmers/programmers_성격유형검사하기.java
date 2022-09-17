import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        // 유형 타입
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        // 해쉬 맵 선언 및 설정 ex) ('R', 0)
        HashMap<Character, Integer> idx = new HashMap<>(); 
        for (int i = 0; i < 8; i++) {
            idx.put(type[i], i);
        }
        
        // 누적 유형 점수 배열 
        int[] cnt = new int[8];
        
        //점수 누적
        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0); // 질문의 첫 선택지
            char b = survey[i].charAt(1); // 질문의 다른 선택지
            
            // 해쉬 맵을 통해 배열 위치를 찾고 점수 추가
            switch(choices[i]) {
                case 1: cnt[idx.get(a)] += 3;
                    break;
                case 2: cnt[idx.get(a)] += 2;
                    break;
                case 3: cnt[idx.get(a)] += 1;
                    break;
                case 4: break;
                case 5: cnt[idx.get(b)] += 1;
                    break;
                case 6: cnt[idx.get(b)] += 2;
                    break;
                case 7: cnt[idx.get(b)] += 3;
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i+=2) {
            if (cnt[i] < cnt[i + 1]) {
                sb.append(type[i + 1]);
            } else {
                sb.append(type[i]);
            }
        }
        
        return sb.toString();
    }
}