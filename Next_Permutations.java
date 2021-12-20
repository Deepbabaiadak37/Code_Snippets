class Solution {
    public void nextPermutation(int[] A) 
    {
        if(A == null || A.length <= 1) 
            return;
        int i = A.length - 2;
        
        while(i >= 0 && A[i] >= A[i + 1]) 
            i--;
        
        if(i >= 0) 
        {                           
            int get_min_max_pos=check(A,i);    
            swap(A, i, get_min_max_pos);                     
        }
        reverse(A, i + 1, A.length - 1);      
    }

    public int check(int[] A,int index)
    {
        int n = A.length - 1;
        while(A[n] <= A[index]) 
                    n--;  
        return n;
    }


    public void swap(int[] A, int i, int j) 
    {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }



    public void reverse(int[] A, int i, int j) 
    {
        while(i < j) 
            swap(A, i++, j--);
    }
}
