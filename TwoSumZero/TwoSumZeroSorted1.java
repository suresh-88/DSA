import java.util.Scanner;
class TwoSumZeroSorted1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		if(containsPair(arr,n))
			System.out.println("Pair exists with sum zero.");
		else
			System.out.println("No Pair exist with sum zero.");
	}
	public static boolean containsPair(int a[],int n){
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==0)
					return true;
		return false;
	}
}