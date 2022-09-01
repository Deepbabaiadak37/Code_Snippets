import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static int f(int i,int j,int m,int n)
    {
        if(i==n-1 && j==m-1) return 1;
        if(i>=n || j>=m) return 0;
        return f(i+1,j,m,n)+f(i,j+1,m,n);
        
    }
	public static int uniquePaths(int m, int n) 
    {   
         return f(0,0,m,n);
	}
}