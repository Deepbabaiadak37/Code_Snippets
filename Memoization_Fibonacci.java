import java.util.*;


//Using memo-i-zation technique
public class Main
{
    static int getFibo(int n,int[] dp)
    {
        if(n==1 || n==0)
            dp[n]=n;
            
        if(dp[n]!=-1) return dp[n];
        else
            return getFibo(n-1,dp)+getFibo(n-2,dp);
    }
    
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(getFibo(n,dp));
     }
	
}
