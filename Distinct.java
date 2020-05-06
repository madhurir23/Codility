/*
Compute number of distinct values in an array. 
*/
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int num:A) {
            set.add(num);
        }
        return set.size();
    }
}
