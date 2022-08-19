/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    
    public int f(TreeNode root)
    {
        
        if(root==null) return 0;
        
        int l=f(root.left);
        int r=f(root.right);
        
        return 1+Math.max(l,r);
    }
    
    
    
    public int maxDepth(TreeNode root) {
        TreeNode temp=root;
        return f(temp);
    }
}