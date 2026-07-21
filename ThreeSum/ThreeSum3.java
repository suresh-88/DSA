import java.util.Scanner;
import java.util.HashSet;
class ThreeSum3
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
		if(containsTriplet(arr,n,k))
			System.out.println("Triplet exists.");
		else
			System.out.println("No such Triplet exists.");
	}
	public static boolean containsTriplet(int a[],int n,int target){
		for(int i=0;i<n-1;i++){
			HashSet<Integer> hs = new HashSet<>();
			for(int j=i+1;j<n;j++){
				if(hs.contains(target-a[i]-a[j]))
					return true;
				else
					hs.add(a[j]);
			}
		}
		return false;
	}
}