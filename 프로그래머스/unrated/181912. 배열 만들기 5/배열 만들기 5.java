class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int count = 0;
        for(int i=0; i<intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k) {
                count++;
            }
        }
        int[] answer = new int[count];
        count = 0;
        for(int i=0; i<intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num > k) {
                answer[count++] = num;
            }
        }
        return answer;
    }
}