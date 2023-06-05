import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(true) {
            arrayList.add(n);
            if(n == 1) {
                break;
            }
            if(n % 2 ==0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}