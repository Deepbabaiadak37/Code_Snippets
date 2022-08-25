import java.util.*;
public class Solution {
	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
         int vis[]=new int[vertex];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertex;i++){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            adj.add(ar);
        }
        for(int i=0;i<edges[0].length;i++){
            ArrayList<Integer> temp=adj.get(edges[0][i]);
            ArrayList<Integer> temp2=adj.get(edges[1][i]);
            temp.add(edges[1][i]);
            temp2.add(edges[0][i]);
        }
        for(int i=0;i<vertex;i++){
            ArrayList<Integer> ar=adj.get(i);
            Collections.sort(ar);
        }
        Queue<Integer> q=new LinkedList<Integer>();
        ArrayList<Integer> bfs=new ArrayList<Integer>();
        q.add(0);
        vis[0]=1;
        for(int i=0;i<vertex;i++){
            if(vis[i]==0)
                q.add(i);
            while(q.isEmpty()!=true){
                int t=q.poll();
                bfs.add(t);
                for(Integer it: adj.get(t)){
                    if(vis[it]==0)
                    {
                        q.add(it);
                        vis[it]=1;
                    }
                }
            }
        }
        return bfs;
	}
}

