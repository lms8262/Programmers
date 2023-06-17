class Solution {
    public String solution(String bin1, String bin2) {
        int sumbin = Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2);
        String answer = String.valueOf(Integer.toBinaryString(sumbin));
        return answer;
    }
}