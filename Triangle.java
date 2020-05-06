/*
Determine whether a triangle can be built from a given set of edges. 
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        if (A.length < 3) return 0;
        Arrays.sort(A);
        for (int i = A.length-1; i >= 2; i--) {
            int max = A[i];
            if (max - A[i-1] < A[i-2]) {
                return 1;
            }
        }
        return 0;
    }
}
