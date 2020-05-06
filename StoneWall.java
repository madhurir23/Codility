/*
Cover "Manhattan skyline" using the minimum number of rectangles. 
*/
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        
        int count = 0;
        for (int i = 0; i < H.length; i++) {
            if (stack.isEmpty()) {
                stack.push(H[i]);
                count++;
            } else {
                int curHeight = stack.peek();
                if (H[i] == curHeight) {
                    continue;
                } else if (H[i] < curHeight) {
                    while (!stack.isEmpty() && stack.peek() > H[i]) {
                        stack.pop();
                    }
                    if (!stack.isEmpty() && H[i] == stack.peek()) {
                        continue;
                    } else {
                        stack.push(H[i]);
                        count++;
                    }
                } else {
                    stack.push(H[i]);
                    count++;
                }
            }
        }    
        
        return count;
    }
}

