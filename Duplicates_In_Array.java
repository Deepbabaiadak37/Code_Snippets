import java.util.*;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(hs.contains(arr.get(i)))
                return arr.get(i);
            else
                hs.add(arr.get(i));
        }
        return -1;
	}
}