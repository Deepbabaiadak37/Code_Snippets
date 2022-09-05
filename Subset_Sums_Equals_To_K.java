import java.util.*;
public class Solution {
    public static int f(int index,int t,int[] arr,int[][] dp)
    {
        if(t==0) return 1;
        if(index==0) 
        {
            if(t==arr[index]) return 1;
            else return 0;
        }
        
        if(dp[index][t]!=-1) return dp[index][t];
        
        int untake=f(index-1,t,arr,dp);
        int take=0;
        if(arr[index]<=t)    take=f(index-1,t-arr[index],arr,dp);
 
        return dp[index][t]= take |untake;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp=new int[n+1][k+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        int ans= f(n-1,k,arr,dp);
        if(ans==1) return true;
        return false;
    }
}
