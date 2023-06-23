import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        while(true) {
            for(int i=2; i<=n; i++) {
                if(n % i == 0) {
                    n /= i;
                    set.add(i);
                    break;
                }
            }
            if (n == 1) {
                break;
            }
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        int count = 0;
        while(itr.hasNext()) {
            answer[count++] = itr.next();
        }
        return answer;
    }
}