class Solution {
    public boolean f(int n,int val)
    {
            if(Math.pow(2,n)>val) return false;
            else if(Math.pow(2,n)==val) return true;
            else  return f(n+1,val);
    }
    
    public boolean isPowerOfTwo(int n) 
    {
        
        return f(0,n);
        
    }
}