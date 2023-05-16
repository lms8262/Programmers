class Solution {
    public String solution(String n_str) {
        int num = 0;
        for(int i=0; i<n_str.length(); i++) {
            if(Integer.parseInt(n_str.substring(i,i+1)) != 0) {
                num = i;
                break;
            }
        }
        return n_str.substring(num);
    }
}