class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        int size = (b1 - a1 + 1) + (b2 - a2 + 1);
        int[] answer = new int[size];
        for(int i=0; i<answer.length; i++) {
            if(i <= b1 - a1) {
                answer[i] = arr[a1+i];
            } else {
                answer[i] = arr[a2+i-b1+a1-1];
            }
        }
        return answer;
    }
}