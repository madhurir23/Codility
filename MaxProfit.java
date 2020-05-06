/*
Given a log of stock prices compute the maximum possible earning. 
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        if (A.length < 2) return 0;
        
        int maxProfit = 0;
        int min = A[0];
        int i = 1;
        
        while (i < A.length) {
            if (A[i] < A[i-1]) min = Math.min(min, A[i]);
            else maxProfit = Math.max(maxProfit, A[i] - min);
            i++;
        }
        
        return maxProfit;
    }
}
