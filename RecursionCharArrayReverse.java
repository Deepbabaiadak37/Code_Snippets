class Solution {
    public void recursionReverse(char[] s,int n)
    {
        if(n>=s.length/2) return;
        
        char temp=s[n];
        s[n]=s[s.length-n-1];
        s[s.length-n-1]=temp;
        
        recursionReverse(s,n+1);
        
    }
    
    
    
    
    public void reverseString(char[] s) {
        
        
        recursionReverse(s,0);
        
    }
}