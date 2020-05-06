/*
Rotate an array to the right by a given number of steps. 
*/
class Solution {
    public int[] solution(int[] A, int K) {
        int len = A.length;
        int[] res =  new int[len];
        
        if (len == 0) return res;
        
        K = K % len;
        
        int index = 0;
        for (int i = len-K; i < len; i++) {
            res[index++] = A[i]; 
        }
        for (int i = 0; i < len-K; i++) {
            res[index++] = A[i]; 
        }
        return res;
    }
}
