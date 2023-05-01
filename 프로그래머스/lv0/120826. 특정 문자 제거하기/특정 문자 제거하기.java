class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] s = my_string.split(letter);
        for(int i=0; i<s.length; i++) {
            answer += s[i];
        }
        return answer;
    }
}