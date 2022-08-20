class Solution {
    public void inOrder(TreeNode root,ArrayList<Integer> ds)
    {
        if(root==null) return;
        
        inOrder(root.left,ds);
        ds.add(root.val);
        inOrder(root.right,ds);
    }

    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ds=new ArrayList<Integer>();
        inOrder(root,ds);
        
        TreeNode ans=new TreeNode(ds.get(0));
        TreeNode temp=ans;
        for(int i=1;i<ds.size();i++)
        {
            TreeNode newNode=new TreeNode(ds.get(i));
            temp.right=newNode;
            temp=newNode;
            
        }
        
        return ans;
        
        
        
    }
}