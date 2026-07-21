import java.util.Scanner;
class TwoSumIndexSorted3
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
		for(int i=0;i<n;i++){
			int temp = bsearch(a,n,k-a[i]);
			if(temp!=-1&&temp!=a[i])
				return new int[]{i,temp};
		}
		return new int[]{-1,-1};
	}
	public static int bsearch(int a[],int n,int k){
		int l=0,h=n-1;
		while(l<=h){
			int m = (l+h)/2;
			if(a[m]==k)
				return m;
			if(a[m]<k)
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}
}