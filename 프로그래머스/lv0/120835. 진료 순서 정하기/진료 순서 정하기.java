import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int[] answer = new int[emergency.length];
        int[] sortEmergency = Arrays.copyOf(emergency, emergency.length); // 배열복사
        Arrays.sort(sortEmergency); // 오름차순 정렬
        
        for(int i=0; i<sortEmergency.length; i++) {
            map.put(sortEmergency[i],sortEmergency.length-i); // key에 기존 배열 값, value에 진료순서
        }
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = map.get(emergency[i]); // 기존 배열에 대응한 진료순서
        }
        
        return answer;
    }
}