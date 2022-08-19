
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> ds=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null) return ans;
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {    
            TreeNode temp=q.remove();
            if(temp!=null)
            {
                ds.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            else
            {
                ans.add(new ArrayList<>(ds));
                ds.removeAll(ds);
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
                
            }
        }
    return ans;
        
    }
}