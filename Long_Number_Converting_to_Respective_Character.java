import java.util.*;
public class Main
{
    public static String encrypt(long num)
    {
        String temp="";
        String s="";
        long mod=0;
        long n=num;
        int count=0;
        while(n!=0)
        {
            mod=n%10;
            if(mod!=0)
            {
                char ch=(char)(96+mod);
                s=s+ch;
            }
            else
                count++;
        
            n=n/10;
            
        }
        
        char[] ch=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
            temp=temp+ch[i];
        
        for(int i=0;i<count;i++)
            temp=temp+'0';
        
        return temp;
        
    }
	public static void main(String[] args) {
        long num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.print(encrypt(num));
	}
}
