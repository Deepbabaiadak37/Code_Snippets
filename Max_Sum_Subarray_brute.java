class Solution {
    public int maxSubArray(int[] nums) 
    {
        int sum=0;
        int max=-99999;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum +=nums[j];
                if(max<sum)
                    max=sum;
            }
            
        }
        
        
        return max;
    }
}