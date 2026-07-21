import java.util.Scanner;
class SumZeroSortedPair1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] a = Pair(arr,n);
		System.out.println("Pair is "+a[0]+" "+a[1]);
	}
	public static int[] Pair(int a[],int n){
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==0)
					return new int[]{a[i],a[j]};
		return new int[]{-1,-1};
	}
}