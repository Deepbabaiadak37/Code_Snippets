class Solution {
    public boolean isPalindrome(int x) {
        String val=Integer.toString(x);
        
        int f=0,l=val.length()-1;
        while(f<l)
        {
            
            if(val.charAt(f)!=val.charAt(l))
                return false;
            f++;
            l--;
        }
        return true;
    }
}