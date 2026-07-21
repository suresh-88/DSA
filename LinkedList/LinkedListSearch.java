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

class LinkedListSearch {
    public static boolean found(Node head,int x) {
        Node p = head;
        while(p!=null)
        {
            if(p.data==x)
                return true;
            p=p.next;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();
        while(n>0)
        {
            System.out.println("Enter value : ");
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