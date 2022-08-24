import java.util.*;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
        Queue<Integer> q=new LinkedList<Integer>();
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        
        while(!q.isEmpty())
            stack.push(q.remove());
	}

}
