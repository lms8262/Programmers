class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n == m) {
            answer[0] = n;
            answer[1] = n;
        } else if (n > m) {
            for(int i=n; i>=1; i--) {
                if(n%i == 0 && m%i == 0) {
                    answer[0] = i;
                    break;
                }
            }
            answer[1] = n/answer[0]*m;
        } else if (n < m) {
            for(int i=m; i>=1; i--) {
                if(m%i == 0 && n%i == 0) {
                    answer[0] = i;
                    break;
                }
            }
            answer[1] = m/answer[0]*n;
        }
        
        return answer;
    }
}