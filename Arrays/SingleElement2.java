import java.util.Scanner;
class SingleElement2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Element is "+FindElement(arr,n));
	}
	public static int FindElement(int[] arr,int n){
		int sum=arr[0];
		for(int i=1;i<n;i++){
			sum^=arr[i];
		}
		return sum;
	}
}