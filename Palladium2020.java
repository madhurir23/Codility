/*
CoverBuildings
Given N rectangular buildings of width 1, find the minimum total area of two rectangular banners that cover all of the buildings. 
*/

class Solution {
    public int solution(int[] H) {
        int len = H.length;
        
        if (len == 1) {
            return H[0];
        }
                
        int[] maxFromRight = new int[len];
        int[] maxFromLeft = new int[len];
        
        int max = H[0];
        for (int i = 0; i < len; i++) {
            max = Math.max(max, H[i]);
            maxFromLeft[i] = max;
        }
        
        max = H[len-1];
        for (int i = len-1; i >= 0; i--) {
            max = Math.max(max, H[i]);
            maxFromRight[i] = max;
        }
        
        int[] dp = new int[len+1];
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i < len; i++) {
            int curVal = (i - 0) * maxFromLeft[i-1];
            curVal += (len - i) * maxFromRight[i];
            min = Math.min(min, curVal);
        }
        
        return min;
    }
}
