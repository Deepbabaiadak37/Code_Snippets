import java.util.* ;
import java.io.*; 
public class Solution {
    public static int f(int index,int target,int[] p,int[] w,int[][] dp)
    {
        
        if(index==0)
            return(int)((target/w[0])*p[0]);
            //number of times it can take same wt to fill the bag
        if(dp[index][target]!=-1) return dp[index][target];
        
        int take=0;
        if(w[index]<=target)
            take=p[index]+f(index,target-w[index],p,w,dp);
            
        int untake=f(index-1,target,p,w,dp);
        
        return dp[index][target]=Math.max(take,untake);
    }
    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight)     {
        // Write your code here.
        int[][] dp=new int[n][w+1];
        
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(n-1,w,profit,weight,dp);
        
    }
}
