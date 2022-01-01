public class Solution {
    public int[] repeatedNumber(final int[] A) {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        int[] x=new int[2];
        for(int i=0;i<A.length;i++)
        {
            if(!a.contains(A[i]))
                a.add(A[i]);
            else
                x[0]=A[i];
        }
        for(int i=1;i<=A.length;i++)
        {
            if(!a.contains(i))
             {  
                  x[1]=i;
                  break;
             }
        }

        return x;

        
    }
}
