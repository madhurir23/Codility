/*
Count the number of triangles that can be built from a given set of edges. 
*/


import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        int count = 0;
        for (int x = 0; x < A.length; x++) {
            int z = x+2;
            for (int y = x + 1; y < A.length; y++) {
                while (z < A.length && A[x] + A[y] > A[z]) z++;
                count += z - y - 1;
            }
        }
        return count;
    }
}
