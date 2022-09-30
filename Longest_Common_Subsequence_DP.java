import java.util.*;

public class Solution {
    
    public static int f(int i,int j,String s,String t,int[][] dp)
    {
        if(i<0|| j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=1+f(i-1,j-1,s,t,dp);
        return dp[i][j]= Math.max(f(i-1,j,s,t,dp),f(i,j-1,s,t,dp));
    }

	public static int lcs(String s, String t) {
		//Your code goes here
        int[][] dp=new int[s.length()][t.length()];
        for(int[] row: dp)
            Arrays.fill(row,-1);
        return f(s.length()-1,t.length()-1,s,t,dp);
    }

}