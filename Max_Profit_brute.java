class Solution {
    public int maxProfit(int[] nums) {
        
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])
                {
                    int diff=nums[j]-nums[i];
                    if(max<diff)
                        max=diff;
                }
            }
        }
        
        return max;
    }
}