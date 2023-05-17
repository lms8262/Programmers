class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = my_string.substring(my_string.length()-1-i,my_string.length());
        }
        for(int i=0; i<answer.length; i++) {
            for(int j=i+1; j<answer.length; j++) {
                if(answer[i].compareTo(answer[j]) >= 1) {
                String temp = answer[i];
                answer[i] = answer[j];
                answer[j] = temp;
                }
            }
        }
        return answer;
    }
}