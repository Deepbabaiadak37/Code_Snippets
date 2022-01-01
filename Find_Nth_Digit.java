
class Solution
{
    public char nthCharacter(String S, int R, int N)
    {
        String s1="";
        //code here
        while(R>0)
        {
            char[] ch=S.toCharArray();
            s1="";
            for(int i=0;i<ch.length;i++)
            {
                
                if(ch[i]=='1')
                    s1=s1+"10";
                else if(ch[i]=='0')
                    s1=s1+"01";
            }
            S=s1;
            R--;
        }
        
        return S.charAt(N);
    }
}



//Output: 101 -->  100110 --> 100101101001--> output will be 1 if N==3 