class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer buffer = new StringBuffer();
        for(int i : index_list) {
            buffer.append(my_string.substring(i,i+1));
        }
        return buffer.toString();
    }
}