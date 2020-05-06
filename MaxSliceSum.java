/*
Find a maximum sum of a compact subsequence of array elements.
*/
class Solution {
    public int solution(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        for (int i = 0; i < A.length; i++) {
            localSum = Math.max(localSum + A[i], A[i]);
            maxSum   = Math.max(localSum, maxSum);
        }
        return maxSum;
    }
}
