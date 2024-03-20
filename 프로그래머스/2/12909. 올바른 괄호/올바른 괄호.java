class Solution {
    boolean solution(String s) {
        if(s.indexOf(")") == 0 || s.lastIndexOf("(") == s.length()-1) {
            return false;
        }
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<s.length(); i++) {
            String s2 = s.substring(i,i+1);
            if(s2.equals("(")) {
                count1++;
            }
            if(count1 >= 1) {
                if(s2.equals(")")) {
                    count2++;
                }
            }
            
            if(count1 == count2) {
                count1 = 0;
                count2 = 0;
            }
        }
        
        if(count1 == count2) {
            return true;
        }

        return false;
    }
}