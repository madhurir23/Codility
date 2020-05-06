/*
 MaxProductOfThree
  Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R). 
*/
class Solution {
    public int solution(int N) {
        int min = Integer.MAX_VALUE;
        int sqrtN = (int)Math.sqrt(N);
        
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                min = Math.min(min, 2 * (i + (N/i)));
            }
        }
        
        return min;
    }
}
