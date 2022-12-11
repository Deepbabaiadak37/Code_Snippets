import java.util.*;

class Solution {
    public int findCenter(int[][] edges) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=0;
        for(int i=0;i<edges.length;i++)
        {
            int first=edges[i][0];
            int second=edges[i][1];
            if(n<first)
                n=first;
            if(n<second)
                n=second;
            if (!hm.containsKey(first))
                hm.put(first,1);
            else
                hm.replace(first,hm.get(first)+1);
            if (!hm.containsKey(second))
                hm.put(second,1);
            else
                hm.replace(second,hm.get(second)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> ob : hm.entrySet())
        {
            Integer val=ob.getValue();
            Integer key=ob.getKey();
            if(val.intValue()==(n-1))
                return key.intValue();
        }


    return 0;
    }
}