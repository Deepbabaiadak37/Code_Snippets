import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int[][] op=new int[Q][3];
		
		//making a dummy array
		int[] a=new int[N];
		Arrays.fill(a,0);
		
		
		//input taking for operations
		for(int i=0;i<Q;i++)
		{
		    int first=sc.nextInt();
		    op[i][0]=first;
		    
		    if(first==1 || first==2)
		    {
		        op[i][1]=sc.nextInt();
		    }
		    else
		    {
		        op[i][1]=sc.nextInt();
		        op[i][2]=sc.nextInt();
		    }
		    
		}
		
		
		//main Logic and output
		
		for(int i=0;i<Q;i++)
		{
		    if(op[i][0]==1)
		    {
		        a[ op[i][1] ]=2*a[ op[i][1] ]+1;
		    }
		    else if(op[i][0]==2)
		    {
		        a[ op[i][1] ]=(int)(Math.floor( a[ op[i][1] ]/2));
		    }
		    else
		    {
		        System.out.println(sum(a,op[i][1],op[i][2]));
		    }
		}
		
	}
	
	
	
	//sum function for operations type 3
	public static int sum(int[] a,int x,int y)
	{
	    int sum=0;
	    for(int i=x;i<=y;i++)
	        sum+=a[i];
	        
	   return sum;
	}
}
