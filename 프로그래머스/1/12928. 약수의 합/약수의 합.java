class Solution {
    public int solution(int n) {
        int answer = 0;
        for(double i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += n/i;
            }
        }
        return answer;
    }
}