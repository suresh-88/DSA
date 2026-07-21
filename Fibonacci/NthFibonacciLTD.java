import java.util.Scanner;
class NthFibonacciLTD
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(NthFib(n));
	}
	public static int NthFib(long N){
		int n=(int)N%60;
		int arr[]=new int[n];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<n;i++){
			arr[i]=(arr[i-1]+arr[i-2])%100;
		}
		return arr[n-1];
	}
}