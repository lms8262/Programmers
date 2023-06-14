class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            String s = my_string.substring(i,i+1);
            if(sb.indexOf(s) == -1) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}