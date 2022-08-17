class Solution {
    public void f(int[] a,List<List<Integer>> ans,List<Integer> ds,boolean[] flag)
    {
        if(ds.size()==a.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(!flag[i])
            {
                flag[i]=true;
                ds.add(a[i]);
                f(a,ans,ds,flag);
                flag[i]=false;
                ds.remove(ds.size()-1);
            }
        }
        
        
    }
    
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        ArrayList<Integer> ds=new ArrayList<Integer>();
        boolean[] flag=new boolean[nums.length];
        Arrays.fill(flag,false);
        
        f(nums,ans,ds,flag);
        return ans;
        
    }
}