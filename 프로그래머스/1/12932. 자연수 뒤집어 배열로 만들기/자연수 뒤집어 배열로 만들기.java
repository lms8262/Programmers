class Solution {
    public int[] solution(long n) {
        String strN = String.valueOf(n);
        int[] answer = new int[strN.length()];
        int num = 0;
        int count = 0;
        for(int i=strN.length(); i>=1; i--) {
            num = Integer.parseInt(strN.substring(i-1,i));
            answer[count++] = num;
        }
        return answer;
    }
}