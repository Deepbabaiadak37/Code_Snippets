
import java.util.*;
public class Main
{
    public static int c=0;
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	   
	   ArrayList<Integer> path = new ArrayList<>();
       
      printSubsequences(a, 0, path,x);
	  System.out.print(c);
	}
	
	
	
    public static int xorOfArray(ArrayList<Integer> arr)
    {
        int xor_arr = 0,n=arr.size();
        for (int i = 0; i < n; i++)
            xor_arr = xor_arr ^ arr.get(i);
     
        return xor_arr;
    }
    
    public static void printSubsequences(int[] arr, int index,ArrayList<Integer> path,int x)
    {
         
        
        if (index == arr.length-1)
        {
            if (path.size() > 0)
            {
               // System.out.println(xorOfArray(path));
                if(xorOfArray(path)<x)
                    c++;
            }
        }
         
        else
        {
            path.add(arr[index]);
            printSubsequences(arr, index + 1, path,x);
            
            path.remove(path.size() - 1);
            printSubsequences(arr, index + 1, path,x);
            
        }
        return;
    }
}
