import java.util.Scanner;
import java.util.Arrays;
class TwoSum2
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
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==k)
				return true;
			else if(a[l]+a[h]<k)
				l++;
			else
				h--;
		}
		return false;
	}
}