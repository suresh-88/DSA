import java.util.*;
public class ElementCount
{
	public static void main(String args[])
	{
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of values ");
		int n=sc.nextInt();
		List<Integer> al = new ArrayList<>();
		System.out.println("Enter values ");
		for(int i=0;i<n;i++)
		{
			int s = sc.nextInt();
			al.add(s);
		}
		System.out.println("Enter a no. to get count ");
		int x=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(al.get(i)+" ");
			if(al.get(i)==x)
				c++;
		}
		System.out.println();
		System.out.println(x+" count is "+c);
	}
}