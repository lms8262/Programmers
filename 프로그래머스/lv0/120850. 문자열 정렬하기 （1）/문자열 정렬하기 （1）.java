class Solution {
    public int[] solution(String my_string) {
        String str = "";
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if('0' <= ch && ch <= '9') {
                str += String.valueOf(ch);
            }
        }
        int[] answer = new int[str.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(str.substring(i,i+1));
        }
        for(int i=0; i<answer.length; i++) {
            for(int j=i+1; j<answer.length; j++) {
                if(answer[i] > answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}