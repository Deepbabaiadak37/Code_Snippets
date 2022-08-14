import java.util.*;

public class Main
{
    public static int BinarySearch(int[] a,int n,int l,int h)
    {
        int mid=(l+h)/2;
        if(l>h) return -1;
        if(a[mid]==n)
            return mid+1;
        else
        {
            if(n>a[mid])
               return BinarySearch(a,n,mid+1,h);
            else
                return BinarySearch(a,n,l,mid-1) ;
        }
        
    }
	public static void main(String[] args) {
		int[] arr={2,4,5,6,8,9,10};
		System.out.print(BinarySearch(arr,10,0,arr.length-1));
	}
}
