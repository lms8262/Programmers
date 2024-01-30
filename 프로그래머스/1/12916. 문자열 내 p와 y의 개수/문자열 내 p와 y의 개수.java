class Solution {
    boolean solution(String s) {
        String upperS = s.toUpperCase();
        int pCount = 0;
        int yCount = 0;
        String sCheck = "";
        
        for(int i=0; i<upperS.length(); i++) {
            sCheck = upperS.substring(i,i+1);
            if(sCheck.equals("P")) {
                pCount++;
            } else if (sCheck.equals("Y")){
                yCount++;
            }
        }
        
        if(pCount == yCount) {
            return true;
        } else {
            return false;
        }
        
    }
}