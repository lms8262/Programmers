class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] numArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        
        int min = numArr[0];
        int max = numArr[0];
        for(int j = 0; j<numArr.length; j++) {
            if(numArr[j] <= min) {
                min = numArr[j];
            }
            if(numArr[j] >= max) {
                max = numArr[j];
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}