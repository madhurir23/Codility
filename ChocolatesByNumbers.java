/*
 There are N chocolates in a circle. Count the number of chocolates you will eat. 
*/
 


class Solution {
    public int solution(int N, int M) {
        int gcd = gcd_func(N, M); 
        
        return N/gcd;
    }
    
    int gcd_func (int a, int b) {
        if (a > b) {
            if (a % b == 0) return b;
            return gcd_func(b, a % b);
        } else {
            if (b % a == 0) return a;
            return gcd_func(a, b % a);
        }
    }
}
