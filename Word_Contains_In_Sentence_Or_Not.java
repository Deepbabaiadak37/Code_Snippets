public class Solution 
{
	public static boolean findWord(String s, String w) 
	{
		//	Write your code here.
        String[] arr=s.split(" ");
        for(String  str:arr)
        {
            if(str.equals(w))
                return true;
        }
        return false;
	}
}