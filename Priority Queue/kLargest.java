import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(;i<k;i++){
           pq.add(input[i]);
        }
        for(;i<input.length;i++){
        if(pq.element()<input[i]){
          pq.remove();
            pq.add(input[i]);
        }
            }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(!pq.isEmpty())
            arr.add(pq.poll());
        return arr;
        }
		
	
}
