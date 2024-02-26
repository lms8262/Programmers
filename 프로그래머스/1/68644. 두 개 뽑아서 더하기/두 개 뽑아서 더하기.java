import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int count = 0;
        while(it.hasNext()) {
            answer[count] = it.next();
            count++;
        };
        
        
        return answer;
    }
}