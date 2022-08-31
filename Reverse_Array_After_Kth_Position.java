import java.util.*;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {    // Write your code here.
       int i=m+1;
       int j=arr.size()-1;
       while(i<=j)
       {
           Collections.swap(arr, i, j);
           i++;
           j--;
       }
    }
}
