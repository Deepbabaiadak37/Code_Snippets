/**********************************************************
	Following is the Binary Tree Node class.

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
		this.data = data;
	    }
	}
	
***********************************************************/

public class Solution {
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        // Write your code here.

		if(root==null  || root.data==node1 || root.data==node2 || root.data==node3) return root;
		BinaryTreeNode<Integer> l= lcaOfThreeNodes(root.left,node1,node2,node3);

        BinaryTreeNode<Integer> r=lcaOfThreeNodes(root.right,node1,node2,node3);

		if(l==null&&r==null)
			return null;
		else if(l==null&&r!=null)
			return r;
		else if (r==null&&l!=null)
			return l;
		else
			return root;


    }
}
