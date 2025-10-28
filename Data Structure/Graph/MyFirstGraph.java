import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency List

    // Constructor
    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        // Initialize each index with a LinkedList
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // remove this line if directed graph
    }

    // Print graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}


public class MyFirstGraph {
    public static void main(String[] args) {
        Graph g = new Graph(5); // Graph with 5 nodes: 0,1,2,3,4

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
