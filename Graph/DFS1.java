import java.util.Scanner;
class Graph{
    int n;
    int M[][];
    Graph(int n)
    {
        this.n = n;
        M = new int[n][n];
    }
    void addEdge(int u,int v){
        M[u][v] = 1;
        M[v][u] = 1;
    }
    void dfs_Traverse(int s,boolean[] visited){
        visited[s] = true;
        System.out.print(s+" ");
        for(int i=0;i<n;i++){
            if(M[s][i]==1&&!visited[i])
                dfs_Traverse(i,visited);
        }
    }
}

class DFS1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of vertices:");
        int n = sc.nextInt();
        System.out.println("Enter no.of Edges:");
        int m = sc.nextInt();
        Graph g = new Graph(n);
        System.out.println("Enter Edges : ");
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u,v);
        }
        boolean[] visited = new boolean[n];
        System.out.println("Enter a start vertex to traverse:");
        int s = sc.nextInt();
        g.dfs_Traverse(s,visited);
    }
    
}