import java.util.*;

class Solution {
    public long solution(long n) {
        String nStr = Long.toString(n);
        String[] nStrArr = nStr.split("");
        Arrays.sort(nStrArr,Collections.reverseOrder());
        String answerStr = String.join("", nStrArr);
        return Long.parseLong(answerStr);
    }
}