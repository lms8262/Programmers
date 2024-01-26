import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        int length = arr.length;
        for(int i=0; i<length; i++) {
            sum += arr[i];
        }
        return sum/length;
    }
}