class Solution {
    
    public boolean isSubsequence(String s, String t) {
        
       int sLen = s.length(), tLen = t.length(), i = 0, j = 0;
        while(i < sLen && j < tLen) {
            if(s.charAt(i) == t.charAt(j)) 
                i++;
            j++;
        }
        if(i == sLen)
            return true;
        return false;
    }
}