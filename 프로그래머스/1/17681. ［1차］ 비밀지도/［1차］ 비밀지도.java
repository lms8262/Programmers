import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                count1 = arr1[i]%2;
                count2 = arr2[i]%2;
                
                if(arr1[i] >=1) {
                    arr1[i] /= 2;    
                }
                if(arr2[i] >=1) {
                    arr2[i] /= 2;    
                }
                
                if(count1 + count2 >= 1) {
                    sb.insert(0,"#");
                } else {
                    sb.insert(0," ");
                }
            }
            
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}