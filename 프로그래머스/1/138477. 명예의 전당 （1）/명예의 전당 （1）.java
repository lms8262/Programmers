class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] ranking = new int[k];
        
        for(int i=0; i<score.length; i++) {
            if(ranking[0] < score[i]) {
                ranking[0] = score[i];
            }
            
            for(int j=1; j<ranking.length;j++) {
                if(ranking[j] < score[i]) {
                    ranking[j-1] = ranking[j];
                    ranking[j] = score[i];
                }
            }
            
            if(i < k) {
                answer[i] = ranking[k-1-i];
            } else {
                answer[i] = ranking[0];    
            }
            
        }
        
        return answer;
    }
}