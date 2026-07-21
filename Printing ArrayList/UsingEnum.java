import java.util.*;
public class UsingEnum
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
		Enumeration<Integer> e = Collections.enumeration(al);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}