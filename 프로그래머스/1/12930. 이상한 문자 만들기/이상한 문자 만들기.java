import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
           if(s.substring(i,i+1).equals(" ")) {
               sb.append(" ");
               count = 0;
           } else {
               if(count%2 ==0) {
                   sb.append(s.substring(i,i+1).toUpperCase());
                   count++;
               } else {
                   sb.append(s.substring(i,i+1).toLowerCase());
                   count++;
               }
           }
        }
        
        return sb.toString();
    }
}