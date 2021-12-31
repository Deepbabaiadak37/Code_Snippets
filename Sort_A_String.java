class Solution 
{ 
    String sort(String s) 
    {
        // code here
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);
        
        return s1;
    }
}