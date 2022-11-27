import java.util.*;
import java.io.*;
  
public class UndirectedGraph {
  
    public int nodes;
    public int edges;
  

    final int maxnode = 15;
  
    Random random = new Random();
    public List<List<Integer>> adjacencyList = new ArrayList<List<Integer>>();

  
    public UndirectedGraph()
    {
        this.nodes = random.nextInt(maxnode) + 1;
        this.edges
            = random.nextInt(computeMaxEdges(nodes)) + 1;
        
        adjacencyList = new ArrayList<>(nodes);
        for (int i = 0; i < nodes; i++)
            adjacencyList.add(new ArrayList<>());
  
        for (int i = 0; i < 15; i++) {
            int v = random.nextInt(nodes);
            int w = random.nextInt(nodes);
            addEdge(v, w);
        }
    }
  
    int numOfVertices=6;
    int computeMaxEdges(int numOfVertices)
    {
        return numOfVertices * ((numOfVertices - 1) / 1);
    }
  
    void addEdge(int v, int w)
    {
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }
  
    public static void main(String[] args)
    {
    	UndirectedGraph ranGraph = new UndirectedGraph();
  
        System.out.println("----------Undirected Graph-------------");
        for (int i = 0;
             i < ranGraph.adjacencyList.size(); i++) {
            System.out.print(i + " Connects to Node/s | ");
  
            List<Integer> list = ranGraph.adjacencyList.get(i);
  
            if (list.isEmpty())
                System.out.print(" Not Connected to vertices. " + "It is not a connected Graph");
            else {
                int size = list.size(); 
                int count=0;
                for (int j = 0; j < size; j++) {
                    System.out.print(list.get(j));
                    count++;
                    if (j < size - 1)
                        System.out.print(", ");
                }
                System.out.print("     Degree is:");
                System.out.print(count);
                
            }

            
            
            	

  
            System.out.println("|");
        }
        
        	
    }
    

}
