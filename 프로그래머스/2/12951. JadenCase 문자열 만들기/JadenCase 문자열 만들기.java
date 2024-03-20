import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(s.charAt(i) == ' ') {
                sb.append(ch);
                count = 0;
                continue;
            }
            if(count == 0) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    sb.append(ch);
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
            } else {
                sb.append(Character.toLowerCase(ch));
            }
            count++;
        }
        
        return sb.toString();
    }
}