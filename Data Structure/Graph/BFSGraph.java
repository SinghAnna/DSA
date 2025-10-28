import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph{
    private int vertices;
    private List<List<Integer>> adj;

    public Graph(int vertices){

        this.vertices = vertices;
        adj = new ArrayList<>();

        for(int i = 0; i < vertices; i++){
            adj.add(new ArrayList<>());
        }

    }

     void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); // for undirected
    }


    void printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    // BFS

    void bfs(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        System.out.print("BFS: ");

        while (!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }

}


public class BFSGraph {
    
    public static void main(String[] args) {
        Graph g = new Graph(5);

        
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);

        g.printGraph();
        g.bfs(0);
    }
}
