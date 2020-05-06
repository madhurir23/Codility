/*
Compute number of distinct absolute values of sorted array elements. 
*/

class Solution {
    public int solution(int[] A) {
        int start = 0;
        int N = A.length;
        int end = N-1;
        int count = 0;
        
        
        while (start <= end) {
            if (A[start] == Integer.MIN_VALUE) {
                start++;
                count++;
            }
            while (start < N-1 && A[start] == A[start+1]) start++;
            int startVal = A[start] < 0 ? -A[start] : A[start]; 
            
            while (end > 0 && A[end] == A[end-1]) end--;
            int endVal = A[end] < 0 ? -A[end] : A[end];
        
            if (startVal < endVal) {
                end--;
                count++;
            } else if (startVal > endVal) {
                start++;
                count++;
            } else {
                start++;
                end--;
                count++;
            }
        }
        
        return count;
    }
}
