import java.util.*;

public class Solution {
    public static long f(int index,int target,int[] arr,long[][] dp)
    {
        if(index==0)
        {
            if(target%arr[index]==0) return 1;
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        long untake=f(index-1,target,arr,dp);
        long take=0;
            if(arr[index]<=target)    take=f(index,target-arr[index],arr,dp);
        
        return dp[index][target]=(long)(take+untake);
    }

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here			
        long[][] dp=new long[denominations.length][value+1];
        for(long[] row: dp)
            Arrays.fill(row,-1);
        
        return f(denominations.length-1,value,denominations,dp);
	}
	
}