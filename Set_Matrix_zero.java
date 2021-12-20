class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int rowSize = matrix.length, columnSize = matrix[0].length;
         
        int[] rowMarker = new int[rowSize]; 
        int[]  columnMarker = new int[columnSize];
     
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<columnSize;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowMarker[i]=1; 
                    columnMarker[j]=1; 
                }
            }
        }
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<columnSize;j++)
            {
                if(rowMarker[i]==1 || columnMarker[j]==1 )
                matrix[i][j]=0;
            }
        }    
    }
}
