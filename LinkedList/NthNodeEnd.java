import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int a)
    {  
        data = a; 
        next = null; 
    }
}

class NthNodeEnd {
    public static int getNth(Node head,int n) {
        Node p = head;
        for(int i=1;i<n;i++)
        {
            if(p==null)
                return -1;
            else
                p=p.next;
        }
        return p.data;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter value : ");
            int x = sc.nextInt();
            Node p = new Node(x) ;
            if(head==null)
                head = p;
            else
            {
                Node temp = head;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=p;
            }
            System.out.println("Do you want to enter another value : ");
            flag = sc.nextBoolean();
        }
        System.out.println("Enter nth position : ");
        int n = sc.nextInt();
        head = reverseLL(head);
        System.out.println("Your LinkedList Nth element from end is "+getNth(head,n));
    }
    static Node reverseLL(Node head){
        Stack<Integer> st = new Stack<>();
        Node p = head;
        while(p!=null)
        {
            st.push(p.data);
            p=p.next;
        }
        p = head;
        while(!st.isEmpty()){
            p.data = st.pop();
            p = p.next;
        }
        return head;
    }
}