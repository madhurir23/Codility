/*
Compute the number of intersections in a sequence of discs. 
*/
import java.util.*;
class Solution {
    public int solution(int[] A) {
        if (A.length == 0) return 0;
        
        long[] circle_start = new long[A.length];
        long[] circle_end = new long[A.length];
        for (int i = 0; i < A.length; i++) {
            circle_start[i] = (long) i - A[i];
            circle_end[i] = (long) i + A[i];
        }
        
        Arrays.sort(circle_start);
        Arrays.sort(circle_end);
        
        int count = 0;
        int j = 0;
        for (int index = 0; index < A.length; index++) {
           while (j < A.length && circle_start[j] <= circle_end[index]) {
                count += j - index;
                if (count > 10000000) return -1;
                j++;
           }
        }
        
        return count;
    }
}
