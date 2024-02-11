class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        char temp = ' ';
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
            
        return String.valueOf(array);
    }
}