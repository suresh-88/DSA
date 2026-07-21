import java.util.Scanner;
class FibonacciOrNot
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(NthFib(n));
	}
	public static String NthFib(int n){
		int a=0,b=1,c=0;
		if(n<=2&&n>=0)
			return "Fibonacci";
		if(n==3)
			return "Fibonacci";
		while(true){
			c = a+b;
			if(c==n)
				return "Fibonacci";
			if(c>n)
				break;
			a=b;
			b=c;
		}
		return "Not Fibonacci";
	}
}