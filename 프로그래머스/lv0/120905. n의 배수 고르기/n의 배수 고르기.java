import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0) {
                arrayList.add(num);
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}