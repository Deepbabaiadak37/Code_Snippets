import java.util.ArrayList;

class Solution {
    public static void f(int index,String str,String s,ArrayList<String> ans)
    {
        if(index>=str.length()) {
            if(s.length()>0)
                ans.add(s);
            return ;
        }
        s=s+str.charAt(index);
        f(index+1,str,s,ans);
        s=s.substring(0,s.length()-1);
        
        f(index+1,str,s,ans);
        
    }
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> ans=new ArrayList<String>();
        f(0,str,"",ans);
        return ans;
        
    }
}