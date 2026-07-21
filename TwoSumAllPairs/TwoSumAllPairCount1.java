import java.util.Scanner;

class TwoSumAllPairCount1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter target :");
		int k = sc.nextInt();
		int a = pairsCount(arr,n,k);
		System.out.println("Pairs count is "+a);
	}
	public static int pairsCount(int a[],int n,int k){
		int count=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==k)
					count++;
		return count;
	}
}