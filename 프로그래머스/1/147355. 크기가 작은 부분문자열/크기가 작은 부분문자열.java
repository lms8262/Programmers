class Solution {
    public int solution(String t, String p) {
        int count = 0;
        long pNum = Long.parseLong(p);
        
        for(int i=0; i<t.length()-p.length()+1; i++) {
            long temp = Long.parseLong(t.substring(i,i+p.length()));
            if(temp <= pNum) {
                count++;
            }
        }
        
        return count;
    }
}