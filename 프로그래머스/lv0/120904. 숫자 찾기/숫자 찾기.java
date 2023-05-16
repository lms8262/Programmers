class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        for(int i=0; i<numStr.length(); i++) {
            if(numStr.substring(i,i+1).equals(kStr)) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}