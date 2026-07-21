import java.util.Scanner;
class FibonacciUptoN
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NFib(n);
	}
	public static void NFib(int n){
		int a=0,b=1,c=1;
		if(n==1)
			System.out.print(0+" ");
		if(n>=2)
			System.out.print(0+" "+1+" ");
		while(true){
			c = a+b;
			if(c<=n)
				System.out.print(c+" ");
			if(c>n)
				break;
			a=b;
			b=c;
		}
	}
}