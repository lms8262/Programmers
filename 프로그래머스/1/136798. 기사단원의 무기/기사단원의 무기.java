class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        int count = 0;
        
        for(int i=1; i<=number; i++) {
            for(int j=1; j<=(int)Math.sqrt(i); j++) {
                if(count>limit) {
                    break;
                }
                if(i%j == 0) {
                    if(i/j != j) {
                        count += 2;
                    } else {
                        count++;
                    }
                }
            }
            
            if(count > limit) {
                sum += power;
            } else {
                sum += count;
            }
            
            count = 0;
        }
        
        return sum;
    }
}