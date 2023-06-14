import java.util.*;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x"," ");
        myString = myString.trim();
        String[] answer = myString.split("\\s+");
        Arrays.sort(answer);
        return answer;
    }
}