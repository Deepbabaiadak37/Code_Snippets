import java.util.*;
public class graph1
{
    //Creating Class for making Edge
    public static class Edge
    {
        int src;
        int dest;
        Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }


    public static void CreateGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));


    }

    public static int CountNodeNeighbours(ArrayList<Edge> graph[],int node)
    {
        

        if(node>=graph.length)
        {
            System.out.println("Node doesnt exist!!");
            return 0;
        }
        System.out.println("Neighbours are: ");
        for(int i=0;i<graph[node].size();i++)
        {
            System.out.print(" "+ graph[node].get(i).dest);
        }
        System.out.println();
        return graph[node].size();
    }

    public static void main(String[] args)
    {
        int vertices=4;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        CreateGraph(graph);
        System.out.println("count of Neighbours : "+ CountNodeNeighbours(graph, 1));
        System.out.println("count of Neighbours : "+ CountNodeNeighbours(graph, 1));

    }
}
