
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int fast=0;
        int last=arr.length-1;
        while(fast<last)
        {
            int temp=arr[fast];
            arr[fast]=arr[last];
            arr[last]=temp;
            fast++;
            last--;
        }
        int[] r=new int[k];
        for(int i=0;i<k;i++)
            r[i]=arr[i];
        return r;
    }
}