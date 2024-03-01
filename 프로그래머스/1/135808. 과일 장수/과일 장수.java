class Solution {
    public int solution(int k, int m, int[] score) {
        int sum = 0;
        int min = 0;
        int count = 0;
        for(int i=k; i>=1; i--) {
            for(int j=0; j<score.length; j++) {
                if(count >= m) {
                    sum += min * m;
                    min = 0;
                    count = 0;
                }
                if(score[j] == i) {
                    min = i;
                    count++;
                }
            }
            if(count >= m) {
                sum += min * m;
                min = 0;
                count = 0;
            }
        }
        
        return sum;
    }
}