/*
Find the earliest time when a frog can jump to the other side of a river. 
*/
class Solution {
    public int solution(int X, int[] A) {
        int N = A.length;
        
        boolean[] locations = new boolean[X+1];
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!locations[A[i]]) count++;
            locations[A[i]] = true;
            if (count == X) return i;
        }
    
        return -1;
    }
}
