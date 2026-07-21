import java.util.*;
class Prime3
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prime(n));
	}
	public static Boolean prime(int n)
	{
		int c=0;
		for(int i=1;i*i<=n;i++){
			if(n%i==0){
				c++;
				if(n%i!=i)
					c++;
			}
		}
		if(c==2)
			return true;
		return false;
	}
}