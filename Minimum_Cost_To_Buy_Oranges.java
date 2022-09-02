import java.util.*;
public class Solution {
    public static int f(int index,int[] cost,int w,int[][] dp)
    {
        if(index==-1 && w==0) return 0;
        if(index==-1) return 10000000;
        if(w==0) return 0;
        
        if(dp[index][w]!=-1) return dp[index][w];
        
        if((index+1)>w ||  cost[index]==-1) return dp[index][w]=f(index-1,cost,w,dp); 
        int left=cost[index]+f(index,cost,w-(index+1),dp);//taking
        int right=f(index-1,cost,w,dp);//not taking
        
        return dp[index][w]=Math.min(left,right);
        
    }

    public static int minCostToBuyOranges(int cost[], int w) {
        //Your code goes here
        int[][] dp=new int[cost.length+10][w+10];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        
        int ans= f(cost.length-1,cost,w,dp);
        if(ans>=10000000) return -1;
        else return ans;
    }
    
}