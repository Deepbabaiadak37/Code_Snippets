import java.util.*;

public class Solution{
    static int f(int[] weight,int[] value,int n,int maxWeight,int[][] dp)
    {
        
        if(n==0){
            if(maxWeight>=weight[0])     return value[0];
            return 0;
        }
        if(dp[n][maxWeight]!=-1) return dp[n][maxWeight];
        
        int untake=0+f(weight,value,n-1,maxWeight,dp);
        int take=Integer.MIN_VALUE;
        if(weight[n]<=maxWeight)
            take=value[n]+f(weight,value,n-1,maxWeight-weight[n],dp);
        return dp[n][maxWeight]=Math.max(take,untake);
    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) 
    {
        int[][] dp=new int[n][maxWeight+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(weight,value,n-1,maxWeight,dp);
    }
}