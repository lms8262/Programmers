import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int length = 1;
        
        for(int i=1; i<food.length; i++) {
            if(food[i] % 2 == 1) {
                length += food[i] - 1;
                food[i] -= 1;
            } else {
                length += food[i];
            }
        }
        
        int[] foodArray = new int[length];
        foodArray[length/2] = 0;
        int count = 0;
        
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                foodArray[count] = i;
                foodArray[foodArray.length-1-count] = i;
                count++;
            }
        }
        
        for(int i=0; i<foodArray.length; i++) {
            sb.append(foodArray[i]);
        }
        
        return sb.toString();
    }
}