public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        int dp[] = new int [n+1];
        for(int i=2;i<=n;i++){
            int min = dp[i-1];
            if(i%3==0){
                if(min>dp[i/3]){
                    min = dp[i/3];
                }
            }
             if(i%2==0){
                if(min>dp[i/2]){
                    min = dp[i/2];
                }
            }
            dp[i]=1+min;
        }
        return dp[n];
	}

}
