
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // Code here
        
        ArrayList<Integer> ans= new ArrayList<>();
        Queue <Integer> que=new LinkedList<Integer>();
       
        que.add(0);
        boolean [] visited=new boolean[V+1];
        Arrays.fill(visited,false);
        visited[0]=true;
        
        while(!que.isEmpty())
        {
           int u=que.poll();
           ans.add(u);
           for(int v:adj.get(u))
           {
               if(visited[v]==false)
               {
                   visited[v]=true;
                   que.add(v);
               }
               
           }  
        }
       return ans;  
        
    }