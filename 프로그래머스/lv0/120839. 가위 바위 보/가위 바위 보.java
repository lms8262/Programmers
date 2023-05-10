class Solution {
    public String solution(String rsp) {
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if(ch == '2') {
                buffer.append("0");
            } else if (ch == '0') {
                buffer.append("5");
            } else if (ch == '5') {
                buffer.append("2");
            }
        }
        return buffer.toString();
    }
}