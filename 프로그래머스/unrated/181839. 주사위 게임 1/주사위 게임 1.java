class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a*b%2 != 0) {
            answer = a * a + b * b;
        } else if ((a+b)%2 != 0) {
            answer = 2 * (a + b);
        } else if ((a+b)%2 == 0 && a*b%2 == 0) {
            if(a > b) {
                answer = a - b;
            } else if(b > a) {
                answer = b - a;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}