import java.util.Scanner;
import java.util.Arrays;
class TwoSumZero2
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
			System.out.println("No Pair exists with sum zero.");
	}
	public static boolean containsPair(int a[],int n){
		Arrays.sort(a);
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==0)
				return true;
			else if(a[l]+a[h]<0)
				l++;
			else
				h--;
		}
		return false;
	}
}