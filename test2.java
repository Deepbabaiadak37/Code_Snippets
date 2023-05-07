
import java.util.*;
public class Main
{
    public static int findLongestUniqueSequence(int[] arr) {
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            while (set.contains(arr[j])) {
                set.remove(arr[i]);
                i++;
            }
            set.add(arr[j]);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		System.out.println(findLongestUniqueSequence(arr));
	}
}
