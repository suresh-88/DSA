import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Graph
{
    int n;
    List<List<Integer>> g = new ArrayList<>();
    Graph(int n)
    {
        this.n = n;
        for(int i=0;i<n;i++){
            ArrayList<Integer> al = new ArrayList<>();
            g.add(al);
        }
        
    }
    void addEdge(int u , int v){
        g.get(u).add(v);
    }
    void printGraph(){
        for(int i=0;i<n;i++){
            System.out.print(i+":");
            for(int x:g.get(i)){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    List<Integer> topoSort()
    {
        int ind[] = new int[n];
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
            for(int x:g.get(i))
                ind[x]++;
        for(int i=0;i<n;i++)
            if(ind[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int p = q.poll();
            ans.add(p);
            for(int x:g.get(p)){
                ind[x]--;
                if(ind[x]==0)
                    q.add(x);
            }
        }  
        return ans;
    }
}
class TopoSortBFS
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
        for(int x:g.topoSort())
            System.out.print(x+" ");
    }
}