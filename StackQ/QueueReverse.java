import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class QueueReverse
{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements ");
        int n = sc.nextInt();
        System.out.println("Enter Queue elements ");
        for(int i=0;i<n;i++)
            q.offer(sc.nextInt());
        System.out.println("Queue before reverse ");
		for(Integer x:q)
			System.out.print(x+" ");
        System.out.println();
        reverseQ(q);
        System.out.println("Queue after reverse ");
		for(Integer x:q)
			System.out.print(x+" ");
	}
    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty())
			st.push(q.poll());
        while(!st.isEmpty())
            q.offer(st.pop());
    }
}