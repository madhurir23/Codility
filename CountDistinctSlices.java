/*
Count the number of distinct slices (containing only unique numbers). 
*/

class Solution {
    public int solution(int M, int[] A) {
        int end = 0;
        int start = 0;
        int count = 0;
        
        boolean[] seen = new boolean[M+1];
        while (start < A.length) {
            while (end < A.length && !seen[A[end]]) {
                seen[A[end++]] = true;
            }
            
            count += end - start;
            if (count > 1000000000) return 1000000000;
            if(start <= end && start < A.length) seen[A[start++]] = false;
            
        }
        return count;
    }
}
