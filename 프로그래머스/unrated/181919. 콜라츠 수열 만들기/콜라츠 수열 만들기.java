import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        while(true) {
            map.put(idx, n);
            idx++;
            if(n == 1) {
                break;
            }
            if(n % 2 ==0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        int[] answer = new int[map.size()];
        for(int i=0; i<map.size(); i++) {
            answer[i] = map.get(i);
        }
        return answer;
    }
}