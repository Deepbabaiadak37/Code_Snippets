import java.util.* ;
import java.io.*; 
public class Solution {
    public static int f(int[] num,int x,int index,int[][] dp)
    {
        if(index==0)
        {
            if(x%num[0]==0)
                return x/num[0];
            else 
                return (int)(1e9);
        }
        if(dp[index][x]!=-1) return dp[index][x];
        
        int take=Integer.MAX_VALUE;
        if(num[index]<=x)
            take=1+f(num,x-num[index],index,dp);
        int untake=f(num,x,index-1,dp);
        
        return dp[index][x]= Math.min(take,untake);
    }
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int[][] dp =new int[num.length][x+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
       if( f(num,x,num.length-1,dp)>=1e9)
           return -1;
        else
            return  f(num,x,num.length-1,dp);
    }

}