class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        char temp1 = ' ';
        char temp2 = ' ';
        for(int i=0; i<array.length; i++) {
            for(int j=1; j<array.length; j++) {
                if(array[j-1] < array[j]) {
                    temp1 = array[j-1];
                    temp2 = array[j];
                    array[j-1] = temp2;
                    array[j] = temp1;
                }
            }
        }
            
        return String.valueOf(array);
    }
}