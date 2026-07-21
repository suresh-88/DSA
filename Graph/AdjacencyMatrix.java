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
class AdjacencyMatrix
{
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
    }
}