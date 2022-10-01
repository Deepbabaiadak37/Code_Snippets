class Solution {
	int count;
	HashMap<Long,Integer> map= new HashMap<>();
    
	public int pathSum(TreeNode root, int targetSum) 
    {
		count=0;
		recur(root,targetSum,0L);
		return count;
	}
    
	public void recur(TreeNode root, int targetSum, long currentSum)
	{
		if(root==null)
			return;
        
		currentSum= currentSum+root.val;
		if(currentSum==targetSum)
			count++;

		count=count+map.getOrDefault(currentSum-targetSum,0);

		map.put(currentSum,map.getOrDefault(currentSum,0)+1);

		recur(root.left,targetSum,currentSum);
		recur(root.right,targetSum,currentSum);

		map.put(currentSum,map.getOrDefault(currentSum,0)-1);
	}
}