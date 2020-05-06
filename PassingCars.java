/*
Count the number of passing cars on the road. 
*/
class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int noEastSoFar = 0;
        boolean exceed = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) noEastSoFar++;
            else sum += noEastSoFar;
            if (sum > 1000000000) exceed = true;
        }
        return exceed == true? -1 : sum;
    }
}
