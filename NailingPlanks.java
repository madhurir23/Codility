/*
Count the minimum number of nails that allow a series of planks to be nailed. 
*/

import java.util.*;

class Solution {
     public int solution(int[] A, int[] B, int[] C) {
        int[][] nails = new int[C.length][2];
        
        for (int i = 0; i < C.length; i++) {
            nails[i][0] = C[i];
            nails[i][1] = i;
        }
        
        Arrays.sort(nails, (nail1, nail2) -> {
            return nail1[0] - nail2[0];
        });
        
        
        int J = 0;
        for (int i = 0; i < A.length; i++) {
            int start = A[i];
            int end = B[i];
            
            int bestIndex = findBestNail(start, end, nails, J);
            if (bestIndex == -1) return -1;
            J = Math.max(J, bestIndex);
        }
        return J + 1;
    }
    
    int findBestNail(int start, int end, int[][] nails, int curResult) {
        int low = 0;
        int high = nails.length;
        
        int index = -1;
        
        while (low < nails.length && low <= high) {
            
            int mid = low + ((high - low) / 2);
            
            if (nails[mid][0] < start) {
                low = mid + 1;
            } else if (nails[mid][0] > end) {
                high = mid - 1;
            } else{
                index = mid;
                high = mid - 1;
            }
        }
        if (index == -1) return -1;
        
        int bestIndex = nails[index][1];
        
        for (int i = index; i < nails.length; i++) {
            int curNailPos = nails[i][0];
            if (curNailPos > end) break;
            bestIndex = Math.min(bestIndex, nails[i][1]);
            if (bestIndex <= curResult) return bestIndex;
        }
        return bestIndex;
    }
}
