class Solution {
    public int solution(int num) {
        int count = 0;
        long num2 = num;
        if(num2 == 1) {
            return 0;
        }
        for(int i=0; i<500; i++) {
            if(num2%2 == 0) {
                num2 = num2/2;
                count++;
            } else {
                num2 = num2*3+1;
                count++;
            }
            if(num2 == 1) {
                break;
            }
        }
        if(num2 != 1) {
            return -1;
        }
        return count;
    }
}