class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;
        int temp = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][1] > sizes[i][0]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > wMax) {
                wMax = sizes[i][0];
            }
            if(sizes[i][1] > hMax) {
                hMax = sizes[i][1];
            }
        }
        
        return wMax * hMax;
    }
}