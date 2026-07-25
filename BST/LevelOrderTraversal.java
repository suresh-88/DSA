import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int a)
    {  
        data = a; 
        left = null; 
        right = null;
    }
}

class LevelOrderTraversal {
    public static void traverse(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=1;i<=n;i++){
                Node p = q.poll();
                System.out.print(p.data+" ");
                if(p.left!=null)
                    q.offer(p.left);
                if(p.right!=null)
                    q.offer(p.right);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter no.of values : ");
        int n = sc.nextInt();
        System.out.println("Enter values : ");
        for(int i=0;i<n;i++){
            int f = sc.nextInt();
            root = insertion(root,f);
        }
        traverse(root);
    }
    public static Node insertion(Node root , int x){
        Node temp = new Node(x);
        if(root==null){
            root = temp;
            return root;
        }
        Node p = root;
        Node pre = null;
        while(p!=null){
            pre = p;
            if(x>p.data)
                p = p.right;
            else
                p = p.left;
        }
        if(x>pre.data)
            pre.right = temp;
        else
            pre.left = temp;
        return root;
    }
}