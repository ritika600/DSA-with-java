/*
    Time complexity: O(2^N)
    Space complexity: O(N)

    where N is the final height of the binary tree
*/

public class Solution {

	public static long balancedBTs(long n){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */if(n==1 || n==0) {
            return 1;
        }
        long x=balancedBTs(n-1);
        long y=balancedBTs(n-2);
        
        return (x*x+2*x*y)%1000000007;

	}
}
