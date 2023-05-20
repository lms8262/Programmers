import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            arrayList.add((arr[i]));
        }
        for(int i=0; i<delete_list.length; i++) {
            if(arrayList.contains(delete_list[i])) {
                arrayList.remove(arrayList.indexOf(delete_list[i]));
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}