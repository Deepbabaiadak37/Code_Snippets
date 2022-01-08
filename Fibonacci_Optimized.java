import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(getFibo1(n));
	}
	static int getFibo1(int n)
    {
        int prev1=1,prev2=0,curri=0;
        for(int i=2;i<=n;i++)
        {
            curri=(prev1+prev2);
            prev2=prev1;
            prev1=curri;
        }
        
        return curri;
        
    }
}
