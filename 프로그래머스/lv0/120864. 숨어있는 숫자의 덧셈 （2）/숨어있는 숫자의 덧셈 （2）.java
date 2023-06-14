import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        StringTokenizer st = new StringTokenizer(my_string);
        while(st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }
        
        return answer;
    }
}