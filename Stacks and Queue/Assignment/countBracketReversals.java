import java.util.*;
public class Solution {

	public static int countBracketReversals(String input) {
        if(input.length() % 2 != 0) return -1;
		Stack<Character> st = new Stack<>();
        for(int i = 0; i<input.length(); i++) {
            if(input.charAt(i) == '{') st.push(input.charAt(i));
            else {
                if(st.isEmpty()) st.push(input.charAt(i));
                else {
                    if(st.peek() == '{') st.pop();
                    else st.push(input.charAt(i));
                }
            }
        }
		int c = 0;
        while(!st.isEmpty()) {
        char c1 = st.pop();
        char c2 = st.pop();
        if(c1 == c2) c++;
        else c += 2;
        }
        return c;
	}

}
