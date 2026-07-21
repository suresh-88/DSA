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

class DeleteNode {
    public static void printTree(Node root) {
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
        System.out.println();
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
        printTree(root);
        System.out.println("Enter a value to delete : ");
        int x = sc.nextInt();
        root = deletion(root,x);
        printTree(root);
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
    public static Node deletion(Node root , int x){
        if(root==null)
            return root;
        Node curr = root;
        Node pre = null;
        while(curr!=null&&curr.data!=x){
            pre = curr;
            if(x>curr.data)
                curr = curr.right;
            else
                curr = curr.left;
        }
        if(curr==null){
            System.out.println("Element not present.");
            return root;
        }
        if(curr.left==null&&curr.right==null){
            if(pre==null)
                return null;
            else if(pre.left==curr)
                pre.left = null;
            else
                pre.right = null;
        }
        else if(curr.left==null){
            if(pre==null)
                return curr.right;
            else if(pre.left == curr)
                pre.left = curr.right;
            else
                pre.right = curr.right;
        }
        else if(curr.right==null){
            if(pre==null)
                return curr.left;
            else if(pre.left == curr)
                pre.left = curr.left;
            else
                pre.right = curr.left;
        }
        else{
            Node in_suc = curr.right;
            Node temp = null;
            while(in_suc.left!=null){
                temp = in_suc;
                in_suc = in_suc.left;
            }
            if(temp==null){
                curr.data = in_suc.data;
                curr.right = in_suc.right;
            }
            else{
                curr.data = in_suc.data;
                temp.left = in_suc.right;
            }
        }
        return root;
    }
}