import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int find(int index,int target,int[] arr,int[][] dp) 
    {
        if(index==0)
        {
            if(target==0 && arr[0]==0) return 2;
            if(target==0 || target==arr[0]) return 1;
            return 0;
        }
        if(dp[index][target]!=-1) return dp[index][target];
        int untake=find(index-1,target,arr,dp);
        int take=0;
        if(arr[index]<=target) 
            take=find(index-1,target-arr[index],arr,dp);
        
        return dp[index][target]=(take+untake)%(int)(1e9+7);
    }
    
	public static int countPartitions(int n, int d, int[] arr) 
    {
        int sum=0;
        for(int i=0;i<n;i++)    sum+=arr[i];
        
        int s2=(sum-d)/2;
        
        if((sum-d)%2!=0 || sum-d<0) return 0;
        
        int[][] dp=new int[n][s2+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return find(n-1,s2,arr,dp);
          
	}
}