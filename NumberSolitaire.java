/*
In a given array, find the subset of maximal sum in which the distance between consecutive elements is at most 6. 
*/

class Solution {
    public int solution(int[] A) {
        int dp[] = new int[A.length];
        dp[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= 6; j++) {
                if (i - j < 0) break;
                max = Math.max(max, dp[i-j]);
            }
            dp[i] = max + A[i];
        }
        
        return dp[A.length - 1];
    }
}
