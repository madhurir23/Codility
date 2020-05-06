/*
Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|. 
*/

class Solution {
    public int solution(int[] A) {
        int len = A.length;
        int[] sumSoFar = new int[len];
        
        sumSoFar[0] = A[0];
        for (int i = 1; i < len; i++) {
            sumSoFar[i] = A[i] + sumSoFar[i-1];
        }
        
        int min = Integer.MAX_VALUE;
        int total = sumSoFar[len-1];
        for (int i = 0; i < len-1; i++) {
            int larger = Math.max(sumSoFar[i], total - sumSoFar[i]);
            int smaller = Math.min(sumSoFar[i], total - sumSoFar[i]);
            min = Math.min(min, larger - smaller);
        }
        return min;
    }
}
