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

class LinkedListSearch2 {
    public static boolean found(Node head,int x) {
        if(head==null)
            return false;
        else
        {
            if(head.data==x)
                return true;
            else
                return found(head.next,x);
        }
    }
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
        System.out.println("Enter a value to find ");
        int x = sc.nextInt();
        if(found(head,x))
            System.out.println("Your element is present.");
        else
            System.out.println("Your element is not present.");
    }
}