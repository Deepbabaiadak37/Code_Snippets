import java.util.*;

public class Solution {
    public static int f(int r,int c,int[][] arr,int[][] dp)
    {
        if(r==0 && c==0) return arr[0][0];
        if(r<0 || c<0)  return (int)1e9;
        if(dp[r][c]!=-1) return dp[r][c];
        
        int up=arr[r][c]+f(r-1,c,arr,dp);
        int left=arr[r][c]+f(r,c-1,arr,dp);
        
        return dp[r][c]= Math.min(up,left);
    }
    
    
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
                dp[i][j]=-1;
        }
        
        return f(grid.length-1,grid[0].length-1,grid,dp);
    }
}




//Another Same Solution


class Solution {
    public int f(int i,int j,int[][] grid,int[][] dp)
    {
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return (int)1e9;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int up=grid[i][j]+f(i-1,j,grid,dp);
        int left=grid[i][j]+f(i,j-1,grid,dp);
        
        return dp[i][j]=Math.min(up,left);
        
    }
    public int minPathSum(int[][] grid) {
        
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        
        return f(grid.length-1,grid[0].length-1,grid,dp);
    }
}