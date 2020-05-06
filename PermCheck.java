/*
Check whether array A is a permutation. 
*/
class Solution {
    public int solution(int[] A) {
        int N = A.length;
        
        boolean[] seen = new boolean[N+1];
        int count = 0;
        for (int val:A) {
            if (val <= N) {
                if (!seen[val]) count++;
                seen[val] = true;
            } else {
                return 0;
            }
        }
        
        
        return (count == N) ? 1 : 0;
    }
}
