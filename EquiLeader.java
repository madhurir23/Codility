/*
Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same. 
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> count1 = new HashMap<>();
        int leaderCount = 0;
        int leader = -1;
        for (int i = 0; i < A.length; i++) {
            count1.put(A[i], count1.getOrDefault(A[i], 0) + 1);
            if (count1.get(A[i]) > leaderCount) {
                leader = A[i];
                leaderCount = count1.get(A[i]);
            }
        }
        
        int res = 0;
        int leftLeaderCount = 0;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] == leader) leftLeaderCount++;
            
            int leftLen = i + 1;
            int rightLen = A.length - leftLen;
            int rightLeaderCount = leaderCount -  leftLeaderCount;
            if (leftLeaderCount <=  leftLen * 0.5) continue;
            if (rightLeaderCount <=  rightLen * 0.5) continue;
            //System.out.println(i);
            res++;
        }
        return res;
    }
}
