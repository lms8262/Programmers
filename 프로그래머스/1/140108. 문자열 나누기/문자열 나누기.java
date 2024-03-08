class Solution {
    public int solution(String s) {
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        String x = "";
        
        for(int i=0; i<s.length(); i++) {
            if(count1 == 0 && count2 == 0) {
                x = s.substring(i,i+1);    
            }
            
            if(s.substring(i,i+1).equals(x)) {
                count1++;
            } else {
                count2++;
            }
            
            if(count1 == count2) {
                answer++;
                count1 = 0;
                count2 = 0;
            }
        }
        
        if(count1 != count2) {
            answer++;
        }
        
        return answer;
    }
}