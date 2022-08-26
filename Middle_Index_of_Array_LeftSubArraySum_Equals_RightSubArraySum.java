class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int mid=i,sum_prev=0,sum_next=0;
            for(int j=0;j<mid;j++)
                sum_prev+=nums[j];
            
            for(int k=mid+1;k<nums.length;k++)
                sum_next+=nums[k];
            
            if(sum_prev==sum_next)
                return mid;
        }
        
        
        return -1;
        
        
    }
}