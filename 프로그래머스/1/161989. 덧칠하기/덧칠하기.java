class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int temp1 = section[0];
        int temp2 = 0;
        
        for(int i=1; i<section.length; i++) {
            temp2 = section[i];
            if(temp2 - temp1 >= m) {
                answer++;
                temp1 = section[i];
                temp2 = 0;
            }
            
        }
        
        return answer;
    }
}