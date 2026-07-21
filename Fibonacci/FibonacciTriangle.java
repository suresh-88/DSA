import java.util.Scanner;
class FibonacciTriangle
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FibTri(n);
	}
	public static void FibTri(int n){
		int a=0,b=1,c=1;
		if(n==1)
			System.out.print(1);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(c+" ");
				c = a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}