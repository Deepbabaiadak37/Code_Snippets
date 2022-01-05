import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count;
		for(int i = start+1 ; i <end ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}
}