import java.util.*;
public class Solution {
    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        Set<Integer> hm=new HashSet<Integer>();
        
        for(int i=0;i<a.length;i++)
        {
            if(!hm.contains(a[i]))
                hm.add(a[i]);
            else
                hm.remove(a[i]);
        
        }
        List<Integer> ans=new ArrayList<Integer>(hm);
        //System.out.print(ans.get(0));
        return ans.get(0);
    }
}
