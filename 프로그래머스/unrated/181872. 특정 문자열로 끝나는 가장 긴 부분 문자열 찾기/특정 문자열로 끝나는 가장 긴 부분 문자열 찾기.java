class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
            String str = myString.substring(0,myString.length()-i);
            if(str.endsWith(pat)) {
                answer = str;
                break;
            }
        }
        return answer;
    }
}