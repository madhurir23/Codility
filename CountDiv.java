/*
Compute number of integers divisible by k in range [a..b]. 
*/
class Solution {
    public int solution(int A, int B, int K) {
        int count = 0;
        
        if (A % K != 0) A = ((A/K) + 1) * K;
        if (B % K != 0) B = (B/K) *  K;
        
        count = (B - A)/K;
        return count+1;
    }
}
