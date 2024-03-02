class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == student1[i%5]) {
                score[0]++;
            }
            if(answers[i] == student2[i%8]) {
                score[1]++;
            }
            if(answers[i] == student3[i%10]) {
                score[2]++;
            }
        }
        
        if(score[0] == score[1] && score[1] == score[2]) {
            return new int[]{1,2,3};
            
        } else {
            if(score[0] == score[1]) {
                if(score[2] > score[0]) {
                    return new int[]{3};
                } else {
                    return new int[]{1,2};
                }
                
            } else if(score[1] == score[2]) {
                if(score[0] > score[1]) {
                    return new int[]{1};
                } else {
                    return new int[]{2,3};
                }
                
            } else if(score[0] == score[2]) {
                if(score[1] > score[0]) {
                    return new int[]{2};
                } else {
                    return new int[]{1,3};
                }
                
            } else {
                if(score[0] > score[1]) {
                    if(score[0] > score[2]) {
                        return new int[]{1};
                    } else {
                        return new int[]{3};
                    }
                    
                }
                if(score[0] > score[2]) {
                    if(score[0] > score[1]) {
                        return new int[]{1};
                    } else {
                        return new int[]{2};
                    }
                    
                }
                if(score[1] > score[0]) {
                    if(score[1] > score[2]) {
                        return new int[]{2};
                    } else {
                        return new int[]{3};
                    }
                    
                }
                if(score[1] > score[2]) {
                    if(score[1] > score[0]) {
                        return new int[]{2};
                    } else {
                        return new int[]{1};
                    }
                    
                }
                if(score[2] > score[0]) {
                    if(score[2] > score[1]) {
                        return new int[]{3};
                    } else {
                        return new int[]{2};
                    }
                    
                }
                if(score[2] > score[1]) {
                    if(score[2] > score[0]) {
                        return new int[]{3};
                    } else {
                        return new int[]{1};
                    }
                    
                }
                
            }
            
        }
        
        return null;
    }
}