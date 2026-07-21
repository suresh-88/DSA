import java.util.Scanner;

class Node
{
	int data;
	Node next;
    public Node(int x)
    {
        data=x;
        next=null;
    }
}

public class MenuDriven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        while(true)
        {
            System.out.println("1.InsertBegin\n2.InsertMiddle\n3.InsertEnd\n4.DeleteBegin\n5.DeleteMiddle\n6.DeleteEnd\n7.PrintLinkedList\n8.Exit");
            System.out.println("\nEnter your choice:");
            int c = sc.nextInt();
            switch(c)
            {
                case 1: 
                        System.out.println("Enter value : ");
                        int x = sc.nextInt();
                        head=insertBegin(head,x);
                        break;
                case 2: 
                        System.out.println("Enter value : ");
                        int y = sc.nextInt();
                        System.out.println("Enter position : ");
                        int p = sc.nextInt();
                        head=insertMiddle(head,y,p);
                        break;
                case 3: 
                        System.out.println("Enter value : ");
                        int z = sc.nextInt();
                        head=insertEnd(head,z);
                        break;
                case 4: head=deleteBegin(head);
                        break;
                case 5: 
                        System.out.println("Enter position : ");
                        int pos = sc.nextInt();
                        head=deleteMiddle(head,pos);
                        break;
                case 6: head=deleteEnd(head);
                        break;
                case 7: printLL(head);
                        break;
                case 8: System.exit(0);
                default:System.out.println("\nEnter valid value");
            }
        }
    }
    static Node insertBegin(Node head,int x){
        Node p = new Node(x) ;
        if(head==null)
            head = p;
        else
        {
            p.next=head;
            head=p;
        }
        return head;
    }

    static Node insertEnd(Node head,int x){
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
        return head;
    }

    static int getLength(Node head) {
        Node p = head;
        int c=0;
        while(p!=null)
        {
            c++;
            p=p.next;
        }
        return c;
    }

    static Node insertMiddle(Node head,int x,int pos){
        Node p = new Node(x) ;
        int c = getLength(head);
        if(c==0)
            System.out.println("Linked List is Empty.\n");
        else if (pos>=c||pos<1)
            System.out.println("Enter valid value in between 1 and "+c+"\n");
        else
        {
            Node temp = head;
            for(int i=1;i<pos;i++)
                temp=temp.next;
            p.next=temp.next;
            temp.next=p;

        }
        return head;
    }

    static Node deleteBegin(Node head){
        if(head==null)
            System.out.println("Linked List is Empty.\n");
        else
        {
            Node p = head;
            head=head.next;
            
        }
        return head;
    }

    static Node deleteMiddle(Node head,int pos){
        int c = getLength(head);
        if(c==0)
            System.out.println("Linked List is Empty.\n");
        else if (pos>=c||pos<2)
            System.out.println("Enter valid value in between 1 and "+c+"\n");
        else
        {
            Node temp = head;
            for(int i=1;i<pos-1;i++)
                temp=temp.next;
            temp.next=temp.next.next;

        }
        return head;
    }

    static Node deleteEnd(Node head){
        if(head==null)
            System.out.println("Linked List is Empty.\n");
        else if(head.next==null)
        {
            
            return null;
        }
        else
        {
            Node p = head;
            while(p.next.next!=null)
                p=p.next;
            Node t = p.next;
            p.next=null;
            
        }
        return head;
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
}