class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char ch;
        for(int i = 0; i < control.length(); i++) {
            ch = control.charAt(i);
            if(ch == 'w') {
                answer += 1;
            } else if(ch == 's') {
                answer -= 1;
            } else if(ch == 'd') {
                answer += 10;
            } else if(ch == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}