class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] arr1 = new int[n];
        int[] arr2 = new int[num_list.length - n];
        for(int i=0; i<num_list.length; i++) {
            if(i < n) {
                arr1[i] = num_list[i];
            } else {
                arr2[i-n] = num_list[i];
            }
        }
        for(int i=0; i<answer.length; i++) {
            if(i < answer.length - n) {
                answer[i] = arr2[i];
            } else {
                answer[i] = arr1[i + n - answer.length];
            }
        }
        return answer;
    }
}