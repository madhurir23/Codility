/*
Count factors of given number n. 
*/
class Solution {
    public int solution(int N) {
        if (N == 1) return 1;
        int i = 1;
        int count = 0;
        int sqrtN = (int)Math.sqrt(N);
        while (i <= sqrtN) {
            if (N % i == 0) count = count + 2;
            i++;
        }
        if (sqrtN * sqrtN == N) count--;
        return count;
    }
}
