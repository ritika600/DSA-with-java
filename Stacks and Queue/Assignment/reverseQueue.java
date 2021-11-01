import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		if(input.size() <= 1) {
            return;
        }
        int element = input.remove();
        reverseQueue(input);
        input.add(element);
	}

}
