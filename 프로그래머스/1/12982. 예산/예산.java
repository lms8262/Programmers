class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 1;
        
        while(true) {
            if(budget < count) {
                break;
            }
            for(int i=0; i<d.length; i++) {
                if(budget < count) {
                    break;
                }
                if(d[i] == count) {
                    budget -= count;
                    answer++;
                    d[i] = 0;
                }
            }
            count++;
        }
        
        return answer;
    }
}