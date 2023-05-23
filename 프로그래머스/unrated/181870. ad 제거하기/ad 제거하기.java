class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(String str : strArr) {
            if(str.indexOf("ad") == -1) {
                count++;
            }
        }
        String[] answer = new String[count];
        count = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].indexOf("ad") == -1) {
                answer[count] = strArr[i];
                count++;
            }
        }
        return answer;
    }
}