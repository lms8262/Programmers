import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = s.toCharArray();
        char ch = ' ';
        
        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == ' ') {
            } else {
                for(int j=0; j<n; j++) {
                    chArr[i]++;
                    if(chArr[i] == (char)('Z'+1) || chArr[i] == (char)('z'+1)) {
                        chArr[i] = (char)(chArr[i]-26);
                    }
                }
                
            }
            sb.append(chArr[i]);
        }
        
        return sb.toString();
    }
}