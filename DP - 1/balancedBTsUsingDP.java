
public class Solution {

	public static int balancedBTs(int n){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(n==0 || n==1){
            return 1;
        }
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
           int mod = (int) (Math.pow(10,9)+ 7);
        for(int i=2;i<=n;i++){
          
        dp[i]=(int)( ( (long)(dp[i-1])*dp[i-1] )%mod + (2*(long)(dp[i-1])*dp[i-2])%mod  ) % mod;
      
        }
     return dp[n];
	}
}
