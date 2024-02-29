class Solution {
    public String solution(int a, int b) {
        int[][] md = {{1,31},{2,29},{3,31},{4,30},{5,31},{6,30},
                           {7,31},{8,31},{9,30},{10,31},{11,30},{12,31}};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day365 = 0;
        
        for(int i=0; i<a-1; i++) {
            day365 += md[i][1];
        }
        day365 += b;
        
        int idx = day365%7;
        
        return week[idx];
    }
}