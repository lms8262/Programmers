class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String changeString = "";
        for(int i=0; i<myString.length(); i++) {
            char ch = myString.charAt(i);
            if(ch == 'A') {
                ch = 'B';
            } else if (ch == 'B') {
                ch = 'A';
            }
            changeString += String.valueOf(ch);
        }

        if(changeString.indexOf(pat) != -1) {
            answer = 1;
        }

        return answer;
    }
}