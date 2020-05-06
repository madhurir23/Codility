/*
Find value that occurs in odd number of elements. 
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        
        for (int num:A) {
            if (set.contains(num)) set.remove(num);
            else set.add(num);
        }
        
        Iterator<Integer> it = set.iterator();
        int val = 0;
        while(it.hasNext()){
            val = it.next();
        }
         
        return val;
    }
}
