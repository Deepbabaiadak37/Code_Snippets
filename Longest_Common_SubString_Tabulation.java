import java.util.* ;
import java.io.*; 
public class Solution {
	public static int lcs(String str1, String str2) {
		// Write your code here.
        int max=Integer.MIN_VALUE;
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str2.length();i++) dp[0][i]=0;
        for(int j=0;j<=str1.length();j++) dp[j][0]=0;
        
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {   
                    dp[i][j]=1+dp[i-1][j-1];
                                      
                }
                else
                    dp[i][j]=0;
                
                max=Math.max(max,dp[i][j]);
            }
        }
        
        return max;
	}
}