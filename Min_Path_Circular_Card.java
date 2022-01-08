import java.util.*;
import java.lang.*;

public class Main
{
    static int getIndex(String[] a,int start,String target)
    {
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(target))
            {   
                t=i;
                break;
            }
        }
        int countfront=0,countback=0;
        
        if(t<start)
        {
            countfront += (a.length-start + t);
            countback += (start-t);
        }
        else
        {
            countfront += (t-start);
            countback += (start+1+a.length-1-t);
        }
        
        
        return   Math.min(countfront,countback);
        
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++)
		    arr[i]=sc.next();
		
		int x=sc.nextInt();
		String s=sc.next();
		
		System.out.print(getIndex(arr,x,s));
	}
}
