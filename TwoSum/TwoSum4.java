import java.util.Scanner;
import java.util.HashSet;
class TwoSum4
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
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++){
			if(hs.contains(k-a[i]))
				return true;
			else
				hs.add(a[i]);
		}
		return false;
	}
}