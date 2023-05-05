class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        for(int i=0; i<myString.length(); i++) {
            if(myString.indexOf(pat,i) != -1) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}