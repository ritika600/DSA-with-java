import java.util.HashMap;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,maxLen=-1;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            //System.out.println("Current cumulative sum: "+sum);
            if (sum==0)
            {
                maxLen=i+1;
            }
            if (map.containsKey(sum))
            {
                int prevIndex=map.get(sum);
                //System.out.println("Sum found previously at index: "+prevIndex);
                int currLen=i-prevIndex;
                //System.out.println("Length of 0 sum: "+currLen);
                if (currLen>maxLen)
                {
                    maxLen=currLen;
                    //System.out.println("Max Length of 0 sum: "+maxLen);
                }
            }
            else
            {
                //System.out.println("Adding sum to HashMap");
                map.put(sum,i);
            }
            //System.out.println();
        }
        return maxLen;
	}
}
