
public class Solution {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        
        if(houses.length==1) return houses[0];
        int[] dp=new int[houses.length];
        
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);
        
        for(int i=2;i<houses.length;i++)
        {
            int pick=houses[i]+dp[i-2];
            int unpick=dp[i-1];
            dp[i]=Math.max(pick,unpick);
        }
        return dp[houses.length-1];
	}
}