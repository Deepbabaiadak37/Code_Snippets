import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int flag=0,result=-1;
        
        int[] arr=new int[str.length()];
        Arrays.fill(arr,0);
        
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                    if(ch[i]==ch[j] && arr[i]==0 && arr[j]==0)
                    {
                        arr[i]=1;
                        arr[j]=1;
                    }
                
            }
        }
        
        for(int i=0;i<str.length();i++)
        {
            if(arr[i]==0)
            {
                System.out.print(i+1);
                break;
            }
        }
        
        System.out.print(result);
        
	}
}
