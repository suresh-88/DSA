import java.util.Scanner;
class LinearSearch3
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter searching element");
		int k = sc.nextInt();
		if(lsearch(arr,n,k))
			System.out.println("Element exists.");
		else
			System.out.println("Element doesn't exist.");
	}
	static boolean lsearch(int[] a,int n,int k){
		if(n==0)
			return false;
		if(a[n-1]==k)
			return true;
		else
			return lsearch(a,n-1,k);
	}
}