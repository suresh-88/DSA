import java.util.*;
public class UsingListIterator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of values ");
		int n=sc.nextInt();
		LinkedList<Integer> al = new LinkedList<>();
		System.out.println("Enter values ");
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			al.add(x);
		}
		ListIterator<Integer> it = al.listIterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}