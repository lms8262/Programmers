import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String[] xArr = X.split("");
        String[] yArr = Y.split("");
        Arrays.sort(xArr,Collections.reverseOrder());
        Arrays.sort(yArr,Collections.reverseOrder());
        X = String.join("",xArr);
        Y = String.join("",yArr);
         
        StringBuilder sb = new StringBuilder();
        
        for(int i=9; i>=0; i--) {
            String strI = String.valueOf(i);
            if(X.indexOf(strI) == -1 || Y.indexOf(strI) == -1) {
                continue;
            }
            
            int xCount = X.lastIndexOf(strI) - X.indexOf(strI) + 1;
            int yCount = Y.lastIndexOf(strI) - Y.indexOf(strI) + 1;
            int count = 0;
            
            if(xCount > yCount) {
                count = yCount;
            } else {
                count = xCount;
            }      

            for(int j=0; j<count; j++) {
                sb.append(i);
            }
            
        }
        
        String answer = sb.toString();
        
        if(answer.equals("")) {
            answer = "-1";
        }
        
        if(answer.substring(0,1).equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}