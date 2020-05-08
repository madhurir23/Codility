/*
Count the number of different ways of climbing to the top of a ladder.
*/

class Solution {
        
    public int[] solution(int[] A, int[] B) {

        int[] fib = new int[A.length + 1];
        int two_power_30 = (int)Math.pow(2, 30);
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= A.length; i++) {
           fib[i] = (fib[i-1] + fib[i-2]) % two_power_30;
        }
        
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
           int two_power_Bi = (int)Math.pow(2, B[i]);
           res[i] = (fib[A[i]]) % two_power_Bi;
        }
        
        return res;
    }   
}
