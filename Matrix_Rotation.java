class Solution {
    public void rotate(int[][] matrix) {
        
        int[][] dummy=new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               dummy[i][j]= matrix[j][i];
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               matrix[i][j]= dummy[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix,i);
        }
        
    }
    
    static void reverse(int[][] matrix,int i)
    {
        int f=0,l=matrix[0].length-1;
        
        while(f<l)
        {
            int temp=matrix[i][f];
            matrix[i][f]=matrix[i][l];
            matrix[i][l]=temp;
            f++;
            l--;
        }
    }
}