import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(temp != arr[i]) {
                list.add(arr[i]);
            }
            temp = arr[i];
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}