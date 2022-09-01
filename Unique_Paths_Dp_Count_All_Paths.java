import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static int f(int m,int n,int[][] dp)
    {
        if (m == 0 && n == 0)    return 1;
        if (m < 0 || n < 0)    return 0;
        if (dp[m][n] != -1)    return dp[m][n];

        int right = f(m - 1, n, dp);
        int down = f(m, n - 1, dp);
        return dp[m][n] = right + down; 
    }
	public static int uniquePaths(int m, int n) 
    {   
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                dp[i][j]=-1;
        }
        return f(m-1,n-1,dp);
	}
}