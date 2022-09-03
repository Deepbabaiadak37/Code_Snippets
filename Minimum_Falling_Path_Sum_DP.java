import java.util.*;
class Solution {
    public int f(int[][] arr,int r,int c,int[][] dp)
    {
        
        if(c<0 || c>=arr[0].length) return (int)(1e9);
        if(r==0) return arr[0][c];
        
        if(dp[r][c]!=-1) return dp[r][c];
        
        int ld=arr[r][c]+f(arr,r-1,c-1,dp);
        int md=arr[r][c]+f(arr,r-1,c,dp);
        int rd=arr[r][c]+f(arr,r-1,c+1,dp);
            
        return dp[r][c]= Math.min(md,Math.min(ld,rd));
    }
    
    
    public int minFallingPathSum(int[][] matrix) 
    {
        
        int min=Integer.MAX_VALUE,c_end=matrix[0].length-1,r_end=matrix.length-1;
        int[][] dp=new int[r_end+1][c_end+1];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        
        for(int i=0;i<matrix[0].length;i++)
        {
            r_end=matrix.length-1;
            c_end=i;
            if(min>f(matrix,r_end,c_end,dp))
                min=f(matrix,r_end,c_end,dp);
        }
        
        
        return min;
        
    }
}