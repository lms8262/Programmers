class Solution {
    public int[] solution(int[] arr) {
        int sumArr = 0;
        for(int i=0; i<arr.length; i++) {
            sumArr += arr[i];
        }
        int[] answer = new int[sumArr];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=count; j<arr[i]+count; j++) {
                answer[j] = arr[i];
            }
            count += arr[i];
        }
        return answer;
    }
}