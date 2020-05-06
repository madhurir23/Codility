/*
 MaxProductOfThree
  Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R). 
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int length = A.length;
        return Math.max(A[0] * A[1] * A[length-1], 
            A[length-3] * A[length-2] * A[length-1]);
        
    }
}
