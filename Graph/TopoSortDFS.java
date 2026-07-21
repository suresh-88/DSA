import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class Graph
{
    int n;
    List<List<Integer>> l = new ArrayList<>();
    Graph(int n)
    {
        this.n = n;
        for(int i=0;i<n;i++){
            ArrayList<Integer> al = new ArrayList<>();
            l.add(al);
        }
        
    }
    void addEdge(int u , int v){
        l.get(u).add(v);
    }
    void printGraph(){
        for(int i=0;i<n;i++){
            System.out.print(i+":");
            for(int x:l.get(i)){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    List<Integer> topoSort()
    {
        boolean visited[] = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(!visited[i])
                dfs(i,visited,st);
        }
        while(!st.isEmpty())
            ans.add(st.pop());
        return ans;
    }
    void dfs(int i,boolean vis[],Stack<Integer> st){
        vis[i]=true;
        for(int x:l.get(i))
            if(!vis[x])
                dfs(x,vis,st);
        st.push(i);
    }
}
class TopoSortDFS
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