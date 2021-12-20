class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> main=new ArrayList<List<Integer>>();
        List<Integer> prelist=null,row;
        
        for(int i=0;i<numRows;i++)
            {
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
                {
                if (j==0 || j==i)
                    row.add(1);
                else
                    row.add(prelist.get(j-1)+ prelist.get(j));
                }
            prelist=row;
            main.add(row);
            }
        
        
        return main;
    }
}