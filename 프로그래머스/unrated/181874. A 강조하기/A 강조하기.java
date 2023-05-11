class Solution {
    public String solution(String myString) {
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i,i+1).equals("a") || myString.substring(i,i+1).equals("A")) {
                answer.append(myString.substring(i,i+1).toUpperCase());
            } else {
                answer.append(myString.substring(i,i+1).toLowerCase());
            }
        }
        return answer.toString();
    }
}