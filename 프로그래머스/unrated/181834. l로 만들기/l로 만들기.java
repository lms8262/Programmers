class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<myString.length(); i++) {
            char ch = myString.charAt(i);
            if('a' <= ch && ch < 'l') {
                sb.append("l");
            } else {
                sb.append(myString.substring(i,i+1));
            }
        }
        return sb.toString();
    }
}