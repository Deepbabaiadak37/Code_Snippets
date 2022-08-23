
    public static int diagonalDifference(List<List<Integer>> arr) 
    {
    int psum=0,ssum=0;
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr.get(0).size();j++)
        {
            if(i==j)
            {
                psum+=arr.get(i).get(j);
                break;
            }
        }
    }
    
    
    
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr.get(0).size();j++)
        {
            if(j==arr.size()-1-i)
            {
                ssum+=arr.get(i).get(j);
                break;
            }
        }
    }
    
    return Math.abs(psum-ssum);

    }
