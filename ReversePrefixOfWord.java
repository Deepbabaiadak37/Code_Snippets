class Solution {
    public String reverse(String s)
    {
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
            ans+=s.charAt(i);
        return ans;
    }
    
    
    public String reversePrefix(String word, char ch) 
    {
     
        String sub=word.substring(0,word.indexOf(ch)+1);
        String remain=word.substring(word.indexOf(ch)+1,word.length());
        
        return reverse(sub)+remain;
    }
}