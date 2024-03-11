class Solution {
    public int solution(int n) {
        StringBuilder reverse3n = new StringBuilder();
        
        while(true) {
            reverse3n.append(n%3);
            n = n/3;
            if(n < 3) {
                if(n == 0) {
                    break;
                }
                reverse3n.append(n);
                break;
            }
        }
        
        String reverse3nStr = reverse3n.toString();
        int count = 1;
        int answer = 0;
        
        for(int i=reverse3nStr.length(); i>0; i--) {
            answer += Integer.parseInt(reverse3nStr.substring(i-1,i)) * count;
            count *= 3;
        }
        
        return answer;
    }
}