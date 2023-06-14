class Solution {
    public int solution(String my_string) {
        int answer = 0;
        if(!my_string.matches(".*[0-9].*")) {
            return answer;
        }
        my_string = my_string.replaceAll("[^0-9]", " ");
        my_string = my_string.trim();
        my_string = my_string.replaceAll(" +", " ");
        String[] strArray = my_string.split("\\s");
        for(String s : strArray) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}