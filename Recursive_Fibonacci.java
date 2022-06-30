import java.util.*;

public class Main
{
    static int getFibo(int n)
    {
        if(n==1 || n==0)
            return n;
        else
            return getFibo(n-1)+getFibo(n-2);
    }
    
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(getFibo(n));
	}
   
}
