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

class TreeSort {
    public static void inorder(Node root) {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
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
        System.out.println("After sorting data ");
        inorder(root);
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