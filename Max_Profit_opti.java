class Solution {
    public int maxProfit(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        int profit=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
            else if(nums[i]-min > profit)
                profit=nums[i]-min;
        }
        
        return profit;
    }
}