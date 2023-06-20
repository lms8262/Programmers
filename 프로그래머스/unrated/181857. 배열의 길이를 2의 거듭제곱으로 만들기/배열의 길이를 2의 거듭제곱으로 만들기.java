class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        while(true) {
            if(num < arr.length && arr.length < num * 2) {
                int[] answer = new int[num * 2];
                for(int i=0; i<num*2; i++) {
                    if(i<arr.length) {
                        answer[i] = arr[i];
                    } else {
                        answer[i] = 0;
                    }
                }
                return answer;
            } else if(num == arr.length) {
                return arr;
            }
            num *= 2;
        }
    }
}