import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = my_string.split(" ", 0);
        for(int i=0; i<strArr.length; i++) {
            arrayList.add(strArr[i]);
            arrayList.remove("");
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}