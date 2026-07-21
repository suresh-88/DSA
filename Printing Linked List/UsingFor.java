import java.util.*;
public class UsingFor
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
		for(int i=0;i<n;i++)
			System.out.println(al.get(i));
	}
}