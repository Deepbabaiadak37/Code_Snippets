import java.util.*;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int val=0;
        ArrayList<Integer> even_ar=new ArrayList<>();
        ArrayList<Integer> odd_ar=new ArrayList<>();
        ArrayList<Integer> finalarr=new ArrayList<>();
        
        int f=0,l=nums.length-1;
        for(int i=0;i<=l;i++)
        {
            if(nums[i]%2==0)
                even_ar.add(nums[i]);
            
            else
                odd_ar.add(nums[i]);
        }
        
        
        
        
        while (even_ar.size() > val && !even_ar.isEmpty()) {
            finalarr.add(even_ar.get(val));
            val++ ;
        }
        val=0;
         while (odd_ar.size() > val && !odd_ar.isEmpty()) {
            finalarr.add(odd_ar.get(val));
            val++ ;
        }
        
        int[] arr=new int[finalarr.size()];
        val=0;
         while (finalarr.size() > val) {
            arr[val]=finalarr.get(val);
            val++ ;
        }
        return arr;
        
    }
}