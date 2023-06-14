class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        if(ab >= 2 * a * b) {
            answer = ab;
        }
        return answer;
    }
}