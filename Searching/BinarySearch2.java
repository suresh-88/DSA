import java.util.Scanner;
class BinarySearch2
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
		int index = bsearch(arr,n,k);
		if(index!=-1)
			System.out.println("Element exists at "+index+" index.");
		else
			System.out.println("Element doesn't exist.");
	}
	static int bsearch(int[] a,int n,int k){
		int l=0,h=n-1;
		while(l<=h){
			int m = l + (h-l)/2;
			if(k==a[m])
				return m;
			else if(k<a[m])
				h=m-1;
			else
				l=m+1;
		}
		return -1;
	}
}