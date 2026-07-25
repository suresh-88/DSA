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

class ReverseLinkedList3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter no.of values : ");
        int n = sc.nextInt();
        System.out.println("Enter values : ");
        while(n>0)
        {
            int t = sc.nextInt();
            Node p = new Node(t) ;
            if(head==null)
                head = p;
            else
            {
                Node temp = head;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=p;
            }
            n--;
        }
        System.out.println("Linked List Before Reversing");
        printLL(head);
        head=reverseLL(head);
        System.out.println("Linked List After Reversing");
        printLL(head);
    }
    static void printLL(Node head){
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
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