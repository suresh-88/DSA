import java.util.Scanner;
class NthFibonacciLD
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(NthFib(n));
	}
	public static int NthFib(int n){
		int a=0,b=1,c=0;
		if(n<=1)
			return 0;
		if(n==2||n==3)
			return 1;
		for(int i=3;i<=n;i++){
			c = (a+b)%10;
			a=b;
			b=c;
		}
		return c;
	}
}