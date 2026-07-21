import java.util.Scanner;
class LinearSearch4
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter searching element");
		int k = sc.nextInt();
		int index = lsearch(a,n,k);
		if(index!=-1)
			System.out.println("Element exists at "+index+" index.");
		else
			System.out.println("Element doesn't exist.");
	}
	static int lsearch(int[] a,int n,int k){
		if(n>0){
			if(a[n-1]==k)
				return n-1;
			else
				return lsearch(a,n-1,k);
		}
		else
			return -1;
		return -1;
	}
}