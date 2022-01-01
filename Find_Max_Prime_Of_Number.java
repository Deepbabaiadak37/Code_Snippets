
class Solution{
    static long largestPrimeFactor(int n) 
    {
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        
    	while (n%2 == 0)
    	{
    		a.add(2);
    		n = n/2;
    	}
    	
    	for (int i = 3; i <= n*n; i = i+2)
    	{
    		while (n%i == 0)
    		{
    			a.add(i);
    			n = n/i;
    		}
    	}
    	
    	if (n > 2)
    		a.add(n);

        return Collections.max(a);
    }
}