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

class LinkedListMiddle2 {
    public static int getMiddle(Node head) {
        Node fp = head;
        Node sp = head;
        while(fp!=null&&fp.next!=null)
        {
            fp=fp.next.next;
            sp=sp.next;
        }
        return sp.data;
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