import java.util.*;
public class Solution {
    
    public static int f(ArrayList<Integer> nums,int n,int[] dp)
    {
        if(n==0) return nums.get(n);
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        
        int pick=f(nums,n-2,dp)+nums.get(n);
        int unpick=0+f(nums,n-1,dp);
        
        return dp[n]=Math.max(pick,unpick);
    }
    
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int n=nums.size();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(nums,n-1,dp);
	}
}