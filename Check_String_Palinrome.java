class Solution
{
public static boolean checkPalindrome(String s)
    {
        char[] ch=s.toCharArray();
        int i=0,j=s.length()-1;
        boolean ans=true;
        while(i<j)
        {
            if(ch[i]!=ch[j])
            {
                ans=false;
                break;
            }
            i++;
            j--;
        }
        
        return ans;
    }
}