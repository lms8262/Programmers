import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i,i+1);
            if(map.containsKey(str)) {
                map.put(str, map.get(str) +1);
            } else {
                map.put(str, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            int count = entry.getValue();
            if(count == 1) {
                answer += str;
            }
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;
    }
}