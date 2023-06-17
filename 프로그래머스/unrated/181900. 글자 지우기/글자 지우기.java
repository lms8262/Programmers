class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArray = my_string.toCharArray();
        for(int i=0; i<indices.length; i++) {
            charArray[indices[i]] = ' ';
        }
        my_string = new String(charArray);
        my_string = my_string.trim();
        my_string = my_string.replaceAll(" ", "");
        return my_string;
    }
}