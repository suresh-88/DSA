import java.util.Scanner;
class NFibonacci1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NFib(n);
	}
	public static void NFib(int n){
		int a=0,b=1;
		if(n==1)
			System.out.print(0);
		if(n>=2){
			System.out.print("0 1");
		}
		for(int i=3;i<=n;i++){
			int c = a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}