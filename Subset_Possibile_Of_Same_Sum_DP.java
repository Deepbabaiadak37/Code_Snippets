import java.util.*;
public class Solution {
    public static int isExistSubArraySumToK(int n,int t,int[] arr,int[][] dp) 
    {
        
        if(n==0) {
            if(arr[n]==t)
                return 1;
            else 
                return 0;
        }
        if(t==0) return 1;
        if(dp[n][t]!=-1) return dp[n][t];
        
        int untake=isExistSubArraySumToK(n-1,t,arr,dp);
        int take=0;
        if(arr[n]<=t)
            take=isExistSubArraySumToK(n-1,t-arr[n],arr,dp);
        
        return dp[n][t]= take | untake;
    }
    
	public static boolean canPartition(int[] arr, int n) {
		// Write your code here.
        
        
        int total=0;
        for(int i=0;i<n;i++) total+=arr[i];
        if(total%2!=0) return false;
        int t=total/2;
        int[][] dp=new int[n+1][t+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        
        if(isExistSubArraySumToK(n-1,t,arr,dp)==1)
            return true;
        else
            return false;
	}
}