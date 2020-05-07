/*
Tie adjacent ropes to achieve the maximum number of ropes of length >= K
*/

class Solution {
    public int solution(int K, int[] A) {
        int count = 0;
        int i = 0;
        while(i < A.length) {
            int sum = A[i];
            while (i != A.length - 1 && sum < K) {
                sum += A[++i];
            }
            if (sum >= K) count++;
            i++;
        }
        return count;
    }
}
