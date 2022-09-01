import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        Collections.sort(arr);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(arr.get(k-1));
        ans.add(arr.get(arr.size()-k));
        return ans;
	}
}
