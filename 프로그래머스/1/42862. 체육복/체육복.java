class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        
        for(int i=0; i<n; i++) {
            students[i] += 1;
        }
        
        for(int i=0; i<lost.length; i++) {
            students[lost[i]-1] -= 1;
        }
        
        for(int i=0; i<reserve.length; i++) {
            students[reserve[i]-1] += 1;
        }
        
        for(int i=0; i<students.length; i++) {
            
            if(i == 0) {
                if(students[i] == 0 && students[i+1] == 2) {
                    students[i]++;
                    students[i+1]--;
                }
                
            } else if(i == students.length-1){
                if(students[i] == 0 && students[i-1] == 2) {
                    students[i]++;
                    students[i-1]--;
                }
                
            } else {
                if(students[i] == 0) {
                    if(students[i-1] == 2) {
                        students[i]++;
                        students[i-1]--;
                    }
                }
                
                if(students[i] == 0) {
                    if(students[i+1] == 2) {
                        students[i]++;
                        students[i+1]--;
                    }
                }
                
            }
        }
        for(int i=0; i<students.length; i++) {
            if(students[i] >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}