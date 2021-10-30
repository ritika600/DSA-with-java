import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<expression.length(); i++) {
            if(expression.charAt(i) == '(') st.push('(');
            else {
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
