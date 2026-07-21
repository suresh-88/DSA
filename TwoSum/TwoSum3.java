import java.util.Scanner;
import java.util.Arrays;
class TwoSum3
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
		if(containsPair(arr,n,k))
			System.out.println("Pair exists.");
		else
			System.out.println("No such Pair exists.");
	}
	public static boolean containsPair(int a[],int n,int k){
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			if(bsearch(a,n,k-a[i]))
				return true;
		}
		return false;
	}
	public static boolean bsearch(int a[],int n,int k){
		int l=0,h=n-1;
		while(l<=h){
			int m = (l+h)/2;
			if(a[m]==k)
				return true;
			if(a[m]<k)
				l=m+1;
			else
				h=m-1;
		}
		return false;
	}
}