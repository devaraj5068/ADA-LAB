import java.util.*;
public class DijkstraSimple {
    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) dist[i] = Integer.MAX_VALUE;
        dist[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = (dist[0] < dist[1] && !visited[0]) ? 0 : 1;
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Distance from " + start + " to " + i + " is " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 3, 0, 7},
            {0, 0, 1, 0},
            {0, 0, 0, 2},
            {0, 0, 0, 0},
        };
         long  start=System.nanoTime(); 

        dijkstra(graph, 0); // Start from node 0
        long  stop=System.nanoTime(); 
long Time=stop-start; 
System.out.println();  
System.out.println("Time taken for execution="+Time); 
    }
}
//output: 
// Distance from 0 to 0 is 0
// Distance from 0 to 1 is 3
// Distance from 0 to 2 is 4
// Distance from 0 to 3 is 5
// Time taken for execution=28426800
