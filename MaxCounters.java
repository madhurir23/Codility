/*
Calculate the values of counters after applying all alternating operations:
increase counter by 1; set value of all counters to current maximum. 
*/
class Solution {
    public int[] solution(int N, int[] A) {
        int[] myArr = new int[N];
        int curMax = 0;
        int finalMax = 0;
        boolean[] lastMaxUpdated = new boolean[N];
        
        for (int operation:A) {
            if (operation == N+1) {
                finalMax = curMax;
                lastMaxUpdated = new boolean[N];
            } else {
                if (!lastMaxUpdated[operation - 1]) 
                    myArr[operation - 1] = finalMax;
                myArr[operation - 1]++;  
                lastMaxUpdated[operation - 1] = true;
                curMax = Math.max(curMax, myArr[operation - 1]);
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (!lastMaxUpdated[i]) myArr[i] = finalMax;
        }
        
        return myArr;
    }
}
