import java.util.Scanner;
import java.util.Arrays;

class Kruskal
{
    static int[] parent;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of vertices");
        int n = sc.nextInt();
        System.out.println("Enter no.of edges");
        int m = sc.nextInt();
        int[][] edges = new int[m][3];
        System.out.println("Enter edges as start & end & weight");
        for(int i=0;i<m;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        System.out.println("Minimum cost is "+costMST(n,edges));
    }
    static int costMST(int n,int[][] edges)
    {
        parent = new int[n];
        for(int i=0;i<n;i++)
            parent[i] = i;
        Arrays.sort(edges,(x,y)->x[2]-y[2]);
        int count=0,cost=0;
        for(int i=0;i<edges.length;i++)
        {
            int x = edges[i][0];
            int y = edges[i][1];
            int w = edges[i][2];
            int x1 = find(x);
            int y1 = find(y);
            if (x1 != y1) {
                union(x,y);
                cost+=w;
                count++;
                if(count==n-1)
                    break;
            }
        }
        return cost;
    }
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY)
            parent[rootY] = rootX;
    }
}