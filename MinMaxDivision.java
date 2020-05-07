/*
Divide array A into K blocks and minimize the largest sum of any block. 
*/

class Solution {
    public int solution(int K, int M, int[] A) {
        int N = A.length;
        int minSum = 0;
        int maxSum = 0;
        for (int num:A) {
            minSum = Math.max(minSum, num);
            maxSum = maxSum + num;
        }
        
        int result = maxSum;
        while (minSum <= maxSum) {
            int midSum = minSum + ((maxSum-minSum)/2);
            //System.out.println(midSum);
            if (isPossible(midSum, K, A)) {
                result = midSum;
                maxSum = midSum - 1;
            } else {
                minSum = midSum + 1;    
            }
        }
        return result;
    }
    
    boolean isPossible(int maxSum, int noOfBlocks, int[] A) {
        int N = A.length;
        int curSum = 0;
        for (int i = 0; i < N; i++) {
            if (curSum + A[i] > maxSum) {
                noOfBlocks--;
                curSum = A[i];
            } else {
                curSum += A[i];
            }
            if (noOfBlocks == 0) return false;
        }
        return true;
    }
}
