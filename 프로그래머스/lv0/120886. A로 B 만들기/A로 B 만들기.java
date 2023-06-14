import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeCharArray = before.toCharArray();
        Arrays.sort(beforeCharArray);
        before = new String(beforeCharArray);
        char[] afterCharArray = after.toCharArray();
        Arrays.sort(afterCharArray);
        after = new String(afterCharArray);
        if(before.equals(after)) {
            answer = 1;
        }
        return answer;
    }
}