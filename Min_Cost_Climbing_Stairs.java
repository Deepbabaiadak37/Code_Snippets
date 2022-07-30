class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        
        int[] dp=new int[cost.length];
        int i=0;
        dp[0]=cost[0];
        dp[1]=cost[1];
        
        
        for( i=2;i<cost.length;i++)
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        
        
        return Math.min(dp[i-1],dp[i-2]);
        
        
        
        
        
        
    }
}