
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void reverse(int n,int[] arr)
    {
        if(n>=arr.length) return;
        
        reverse(n+1,arr);
        System.out.print(arr[n]+" ");
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int j=0;j<n;j++)
		        arr[j]=sc.nextInt();
		        
		    reverse(0,arr);
		    
		}
	}
}