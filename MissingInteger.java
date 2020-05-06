/*
Find the smallest positive integer that does not occur in a given sequence.
*/
import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num:A) if (num > 0) seen.add(num);
        
        int notFound = 1;
        int count = 0;
        
        while (count != seen.size()) {
            if (seen.contains(notFound)) {
                notFound++;
                count++;
            } else return notFound;
        }
        return notFound;
    }
}
