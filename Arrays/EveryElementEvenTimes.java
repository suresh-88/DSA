import java.util.Scanner;
class EveryElementEvenTimes
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(FindElement(arr,n))
			System.out.println("Every Element occurs Even Times.");
		else
			System.out.println("Not Every Element occurs Even Times.");
	}
	public static boolean FindElement(int[] arr,int n){
		if(n%2!=0)
			return false;
		int sum=arr[0];
		for(int i=1;i<n;i++){
			sum^=arr[i];
		}
		if(sum==0)
			return true;
		return false;
	}
}