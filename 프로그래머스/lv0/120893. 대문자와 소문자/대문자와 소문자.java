class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if('a' <= ch && ch <= 'z') {
                answer.append(my_string.substring(i,i+1).toUpperCase());
            } else if ('A' <= ch && ch <= 'Z') {
                answer.append(my_string.substring(i,i+1).toLowerCase());
            }
        }
        return answer.toString();
    }
}