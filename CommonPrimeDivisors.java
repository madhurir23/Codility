/*
Check whether two numbers have the same prime divisors. 
*/

class Solution {
    public int solution(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int num1 = A[i];
            int num2 = B[i];
            
            int gcd = gcd_func(num1, num2);
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            int gcd1 = gcd;
            while (max != 1) {
                gcd1 = gcd_func(max, gcd1);
                if (gcd1 == 1) break;
                max = max/gcd1;
            }
            if (max != 1) continue;
            
            int gcd2 =  gcd;
            while (min != 1) {
                gcd2 = gcd_func(min, gcd2);
                if (gcd2 == 1) break;
                min = min/gcd2;
            }
            if (min != 1) continue;
            count++;
        }
        return count;
    }
    
    int gcd_func(int a, int b) {
        
        if (a > b) {
            if (a % b == 0) return b;
            return gcd_func(b, a % b);
        } else {
            if (b % a == 0) return a;
            return gcd_func(a, b % a);
        }
    }
}
