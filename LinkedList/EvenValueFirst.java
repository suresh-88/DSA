import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int a)
    {  
        data = a; 
        next = null; 
    }
}

class EvenValueFirst {
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
        System.out.println("Linked List Before Segregation");
        printLL(head);
        head = segregate(head);
        System.out.println("Linked List After Segregation");
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
    static Node segregate(Node head){
        Node p = head.next;
        Node t = head;
        while(p!=null){
            if(p.data%2==0){
                int temp = p.data;
                p.data = t.data;
                t.data = temp;
                t = t.next;
            }
            p = p.next;
        }
        return head;
    }
}