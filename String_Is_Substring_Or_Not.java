import java.util.*;
class Main{
    static int isSubstring(String s1, String s2)
	{
		int M = s1.length();
		int N = s2.length();
        
		for (int i = 0; i <= N - M; i++) 
		{
			int j;
			for (j = 0; j < M; j++)
				if (s2.charAt(i + j)!= s1.charAt(j))
					break;
			if (j == M)
				return i;
		}

		return -1;
	}
    public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
        int res=0;
        
        if(s1.length()<s2.length())
		 res = isSubstring(s1, s2);
        else
            res=isSubstring(s2,s1);

	    System.out.println(res);
		
	}
}
