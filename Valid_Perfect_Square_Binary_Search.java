class Solution {
    public boolean isPerfectSquare(int num) {
        long strt=1, end = num/2;
        long mid = 0;
        
        if(num==1)
            return true;
        
        while(strt<=end) {
            mid = (end-strt)/2+strt;

            if((mid*mid)==num)
                return true;
            
            if((mid*mid) < num) {
                strt = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        
        return false;
    }
}