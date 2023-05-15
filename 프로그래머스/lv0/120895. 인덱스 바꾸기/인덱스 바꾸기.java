class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String str1 = my_string.substring(num1,num1+1);
        String str2 = my_string.substring(num2,num2+1);
        for(int i=0; i<my_string.length(); i++) {
            String str3 = my_string.substring(i,i+1);
            if(i == num1) {
                sb.append(str2);
            } else if (i == num2) {
                sb.append(str1);
            } else {
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}