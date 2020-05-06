/* 
Find the minimal average of any slice containing at least two elements. 
*/
class Solution {
    public int solution(int[] A) {
        int i = 0;
        int N = A.length;
    
        if (N == 2){
            return 0;
        }
    
        //initialize the current minimum average of the first two slots.
        double minavg = (A[0] + A[1]) / 2.0;
        int idx = 0;
        
    
        for (i = 2; i < N; i++){
            double tmp1 = (A[i - 1] + A[i]) / 2.0;
            double tmp2 = (A[i - 2] + A[i - 1] + A[i]) / 3.0;
            
            if (tmp1 < minavg){
                idx = i - 1;
                minavg = tmp1;
            }
            if (tmp2 < minavg){
                idx = i - 2;
                minavg = tmp2;
            }
        }
        return idx;
    }
}
