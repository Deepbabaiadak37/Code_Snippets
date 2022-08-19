
class Solution {
    public int maxLevelSum(TreeNode root) {
        
        int k=1,index=0;
        int sum=0,max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            TreeNode temp=q.remove();
            
            if(temp==null)
            {
                if(sum>max)
                {
                   max=sum; 
                   index=k;
                }
                    k++;
                sum=0;
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
                    
            }
            else
            {
                
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
                
            }
        }
        
        
        return index;
        
    }
}