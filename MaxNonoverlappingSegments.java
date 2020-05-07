/*
Find a maximal set of non-overlapping segments
*/

class Solution {
    public int solution(int[] A, int[] B) {
        int N =  A.length;
        int count = 0;
        int i = 0;
        while (i < N) {
            count++;
            int max = B[i];
            int j = i+1;
            while (j < N && A[j] <= max) {
                // Choose the shortest segment
                max = Math.min(max, B[j]);
                j++;
            }
            i = j;
        }
        
        return count;
    }
}
