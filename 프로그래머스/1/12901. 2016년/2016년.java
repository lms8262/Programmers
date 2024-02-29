class Solution {
    public String solution(int a, int b) {
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day365 = 0;
        
        for(int i=0; i<a-1; i++) {
            day365 += day[i];
        }
        day365 += b;
        
        int idx = day365%7;
        
        return week[idx];
    }
}