import java.util.*;
public class Solution {
    public static int f(int n,int[] p,int target,int[][] dp)
    {
        if(n==1)    return target*p[0];
        
        if(dp[n-1][target]!=-1) return dp[n-1][target];
        
        int take=Integer.MIN_VALUE;
        if(n<=target)
            take=p[n-1]+f(n,p,target-n,dp);
        int untake=f(n-1,p,target,dp);
        
        
        return dp[n-1][target]=Math.max(take,untake);
    }
	public static int cutRod(int price[], int n) {
		// Write your code here.
        int[][] dp=new int[n][n+1];
        for(int[] row:dp)
        Arrays.fill(row,-1);
        return f(n,price,n,dp);
	}
}