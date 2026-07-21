import java.util.Scanner;
class NthEvenFibonacci2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(NthFib(n));
	}
	public static int NthFib(int n){
		int a=0,b=2,c=0;
		if(n<=1)
			return a;
		if(n==2)
			return b;
		while(n>2){
			c = 4*b+a;
			a=b;
			b=c;
			n--;
		}
		return c;
	}
}