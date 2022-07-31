class Solution {
    public String longestPalindrome(String s) {
        
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            //for even center element
            int len1=Expand(s,i,i);
            //for odd center element
            int len2=Expand(s,i,i+1);
            int max_len=Math.max(len1,len2);
            
            if(end-start <max_len)
            {
                start=i-(max_len-1)/2;
                end=i+max_len/2;
            }
            
        }
        
        return s.substring(start,end+1);
        
    }
    
    
    public int Expand(String s ,int i,int j)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
        
    }
}