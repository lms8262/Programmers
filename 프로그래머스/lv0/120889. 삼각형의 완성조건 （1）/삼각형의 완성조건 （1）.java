class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max = sides[0];
        for(int i : sides) {
            if(max < i) {
                max = i;
            }
        }
        if((max == sides[0] && sides[1] + sides[2] > sides[0])
          ||(max == sides[1] && sides[0] + sides[2] > sides[1])
          ||(max == sides[2] && sides[0] + sides[1] > sides[2])) {
            answer = 1;
        }
        return answer;
    }
}