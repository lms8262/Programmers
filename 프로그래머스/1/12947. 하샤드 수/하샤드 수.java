class Solution {
    public boolean solution(int x) {
        String strX = String.valueOf(x);
        int sum = 0;
        
        for(int i=0; i<strX.length(); i++) {
            sum += Integer.parseInt(strX.substring(i,i+1));
        }
        
        if(x%sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}