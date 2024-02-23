class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        int count = 1;
        
        for(int i=1; i<s.length(); i++) {
            answer[i] = -1;
            count = 1;
            
            for(int j=i-1; j>=0; j--) {
                if(answer[i] == -1) {
                    if(s.substring(i,i+1).equals(s.substring(j,j+1))) {
                    answer[i] = count;
                    }    
                }
                count++;
            }
        }
        
        return answer;
    }
}