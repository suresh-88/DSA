import java.util.Scanner;
import java.util.HashSet;
class TwoSumZero3
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
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++){
			if(hs.contains(0-a[i]))
				return true;
			else
				hs.add(a[i]);
		}
		return false;
	}
}