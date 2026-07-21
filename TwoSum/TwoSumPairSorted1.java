import java.util.Scanner;
class TwoSumPairSorted1
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
		int[] a = Pair(arr,n,k);
		System.out.println("Pair is "+a[0]+" "+a[1]);
	}
	public static int[] Pair(int a[],int n,int k){
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]+a[j]==k)
					return new int[]{a[i],a[j]};
		return new int[]{-1,-1};
	}
}