import java.util.Scanner;
class TwoSumIndexSorted2
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
		int[] a = pairIndex(arr,n,k);
		System.out.println("Pair indices are "+a[0]+" "+a[1]);
	}
	public static int[] pairIndex(int a[],int n,int k){
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==k)
				return new int[]{l,h};
			else if(a[l]+a[h]<k)
				l++;
			else
				h--;
		}
		return new int[]{-1,-1};
	}
}