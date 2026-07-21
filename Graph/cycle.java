import java.util.Scanner;
class Graph
{
    int n;
    int M[][];
    Graph(int n)
    {
        this.n = n;
        M = new int[n][n];
    }
    void addEdge(int u , int v){
        M[u][v] = 1;
        M[v][u] = 1;
    }
    void printGraph(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class cycle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of vertices");
        int n = sc.nextInt();
        Graph g = new Graph(n);
        System.out.println("Enter no.of edges");
        int m = sc.nextInt();
        System.out.println("Enter edges as start & end");
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u,v);
        }
        g.printGraph();
        System.out.println(hasCycle(graph, n));
    }

    static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, graph)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true; 
            }
        }
        return false;
    }

    static boolean hasCycle(List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, graph)) {
                    return true;
                }
            }
        }
        return false;
    }
}