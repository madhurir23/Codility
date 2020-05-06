/*
Determine whether a given string of parentheses (single type) is properly nested. 
*/
import java.util.*;
class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch:S.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else {
                if (stack.isEmpty()) return 0;
                stack.pop();
            }
        }
        
        return stack.isEmpty() ? 1 : 0; 
    }
}
