/*
Find the minimal absolute value of a sum of two elements.
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        int N =  A.length;
        if (N == 1) return A[0];
        
        // If only positive numbers, return sum of least two numbers
        if (A[0] >= 0) 
            return Math.min(A[0] + A[0], A[0] + A[1]);
        // If only negative numbers, return sum of least two numbers
        if (A[A.length-1] <= 0) 
            return Math.min(-A[N-1] - A[N-1], -A[N-1] - A[N-2]);
        
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = A.length-1;
        while (A[start] < 0) {
            int curSum =  A[end] + A[start];
            if (curSum < 0) curSum = -curSum;
            min = Math.min(min, curSum);
            
            if (-A[start] < A[end]) end--;
            else if (-A[start] > A[end]) start++;
            else if (-A[start] == A[end]) return 0;
        }
        // All numbers before start are negative
        // All numbers after start, incl at start are positive
        if (start + 1 < A.length) {
            min = Math.min(min, A[start] + A[start]);
            min = Math.min(min, A[start] + A[start+1]);
        }
            
        if (start - 2 >= 0) {
            min = Math.min(min, -A[start-1] - A[start-1]);
            min = Math.min(min, -A[start-2] - A[start-1]);
        }
        return min;
    }
}
