/*
Find longest sequence of zeros in binary representation of an integer. 
*/

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N); 
        
        boolean gapStart = false;
        int gapCount = 0;
        int max = 0;
        
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                max = Math.max(max, gapCount);
                gapStart = true;
                gapCount = 0;
            } else {
                if (gapStart) gapCount++;
            }
            
        }
        
        return max;
    }
}
