import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Integer[] aArr = new Integer[A.length];
        Integer[] bArr = new Integer[B.length];
        for(int i=0; i<A.length; i++) {
            aArr[i] = A[i];
            bArr[i] = B[i];
        }
        
        Arrays.sort(aArr);
        Arrays.sort(bArr,Collections.reverseOrder());
        for(int i=0; i<aArr.length; i++) {
            answer += aArr[i]*bArr[i];
        }

        return answer;
    }
} 