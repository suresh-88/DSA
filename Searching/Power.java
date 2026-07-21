import java.util.Scanner;
class Power
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("x power n is " is "+power(x,n));
	}
	static int position(int x,int n){
		int res=1;
		while(n>0){
			if(n%2==0)
				res*=x;
			
		}
	}
}