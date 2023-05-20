class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                          "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
                          "-.--","--.."};
        StringBuilder sb = new StringBuilder();
        String[] letterArray = letter.split(" ");
        for(int i=0; i<letterArray.length; i++) {
            for(int j=0; j<morse.length; j++) {
                if(letterArray[i].equals(morse[j])) {
                    sb.append(String.valueOf((char)('a'+j)));
                    break;
                }
            }
        }
        return sb.toString();
    }
}