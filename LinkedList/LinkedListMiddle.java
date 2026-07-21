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

class LinkedListMiddle {
    public static int getMiddle(Node head) {
        Node p = head;
        int c=0;
        while(p!=null)
        {
            c++;
            p=p.next;
        }
        p = head;
        for(int i=0;i<c/2;i++)
            p = p.next;
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
        System.out.println("Your LinkedList Middle element is "+getMiddle(head));
    }
}