import java.util.*;
class Prime4
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime(n));
	}
	public static Boolean prime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false;
		return true;
	}
}