import java.util.Scanner;
class FullFibonacci
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(Fib(n)){
			int r=0;
			while(n>0){
				r=n%10;
				if(!Fib(r)){
					System.out.println("Half Fibonacci");
					System.exit(4);
				}
				n/=10;
			}
			System.out.println("Full Fibonacci");
		}
		else
			System.out.println("Not Full Fibonacci");
	}
	public static boolean Fib(int n){
		int a=0,b=1,c=0;
		if(n<=3&&n>=0)
			return true;
		while(true){
			c = a+b;
			if(c==n)
				return true;
			if(c>n)
				break;
			a=b;
			b=c;
		}
		return false;
	}
}