class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul = 1;
        for(int i=1; i<=n; i++) {
            answer = i;
            mul *= i;
            if(mul > n) {
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}