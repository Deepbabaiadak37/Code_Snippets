import java.util.*;
class Solution {
    
    public int f(int i,int j,int m,int n,int[][] ds){
        if(i==(m-1) && j==(n-1)) return 1;
        if(i>=m || j>=n) return 0;
        
        if(ds[i][j]!=-1) return ds[i][j];
        return ds[i][j]=f(i+1,j,m,n,ds)+f(i,j+1,m,n,ds);
    }
    public int uniquePaths(int m, int n) {
        
        int[][] ds=new int[m][n];
        for(int i=0;i<ds.length;i++)
        {
            Arrays.fill(ds[i],-1);
        }
        return f(0,0,m,n,ds);
        
    }
}