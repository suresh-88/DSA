import java.util.*;
public class UsingListIterator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of values ");
		int n=sc.nextInt();
		List<Integer> al = new ArrayList<>();
		System.out.println("Enter values ");
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			al.add(x);
		}
		ListIterator<Integer> iterator = al.listIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}