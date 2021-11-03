import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) != ')') {
                st.push(expression.charAt(i));
            } else {
                int count = 0;
                while(st.peek() != '(') {
                    count++;
                    st.pop();
                }
                
                if(count > 1) {
                    st.pop();
                    if(st.isEmpty()) {
                        return false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return true;
	}
}
