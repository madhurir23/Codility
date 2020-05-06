/*
Find an index of an array such that its value occurs at more than half of indices in the array. 
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();
        
        int len = A.length;
        int index = 0;
        for (int a : A) {
            count.put(a, count.getOrDefault(a, 0) + 1);
            
            if (count.get(a) > len/2) return index;
            index++;
        }
        
        return -1;
    }
}
