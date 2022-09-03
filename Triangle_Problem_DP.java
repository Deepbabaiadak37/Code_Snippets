import java.util.*;

public class Solution {
    public static int f(int[][] arr,int i,int j,int n,int[][] dp)
    {
       if(i==n-1 && j<=i) return arr[i][j]; 
       if(i>=n || j>i) return (int)1e9;
        
       if(dp[i][j]!=-1) return dp[i][j];
       int down=arr[i][j]+f(arr,i+1,j,n,dp);
       int dright=arr[i][j]+f(arr,i+1,j+1,n,dp);
       
        
        return dp[i][j]=Math.min(down,dright);
        
    }
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int[][] dp=new int[n][n];
        
        for(int[] row: dp)
            Arrays.fill(row,-1);
        return f(triangle,0,0,n,dp);
    }
}