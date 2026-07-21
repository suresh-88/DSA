import java.util.Scanner;
class NthEvenFibonacci
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(NthFib(n));
	}
	public static int NthFib(int n){
		int a=0,b=1,c=0;
		if(n<=0)
			return 0;
		while(n>1){
			c = a+b;
			if(c%2==0)
				n--;
			a=b;
			b=c;
		}
		return c;
	}
}