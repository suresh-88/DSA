import java.util.Scanner;
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

class LeafNodes1 {
    public static void inorderLeafNodes(Node root) {
        if(root!=null)
        {
            inorderLeafNodes(root.left);
            if(root.left==null&&root.right==null)
                System.out.print(root.data+" ");
            inorderLeafNodes(root.right);
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
        inorderLeafNodes(root);
        System.out.println();
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