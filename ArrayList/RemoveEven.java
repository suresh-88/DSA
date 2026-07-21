import java.util.*;
public class RemoveEven
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
		System.out.println("Before removing even no.s");
		al.forEach(System.out::println);
		al.removeIf(m->(m%2)==0);
		System.out.println("After removing even no.s");
		al.forEach(System.out::println);
	}
}