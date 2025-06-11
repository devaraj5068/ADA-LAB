import java.util.*;//Warshal’s and Floyd’s
public class AllPairShortestPath {
    final static int INF = 99999, V = 4;

    void floydWarshall(int[][] dist) {
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        printSolution(dist);
    }

    void printSolution(int[][] dist) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            { 0, 5, INF, 10 },
            { INF, 0, 3, INF },
            { INF, INF, 0, 1 },
            { INF, INF, INF, 0 }
        };
         long  start=System.nanoTime();
        new AllPairShortestPath().floydWarshall(graph);
         long  stop=System.nanoTime();
          long Time=stop-start; 
        System.out.println();
        System.out.println("Time taken for execution="+Time); 

    }
}
// Output:0 5 8 9 
//INF 0 3 4
//INF INF 0 1
//INF INF INF 0

//Time taken for execution=31561400