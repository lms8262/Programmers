import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=1000; i++) {
            map.put(i, n);
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