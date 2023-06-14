class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);
        for(int a=i; a<=j; a++) {
            if(String.valueOf(a).contains(kStr)) {
                char[] aArray = String.valueOf(a).toCharArray();
                for(char c : aArray) {
                    if(String.valueOf(c).equals(kStr)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}