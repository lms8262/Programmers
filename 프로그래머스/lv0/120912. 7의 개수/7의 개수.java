class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            String str = String.valueOf(array[i]);
            char[] charArray = str.toCharArray();
            for(int j=0; j<charArray.length; j++) {
                if(charArray[j] == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}