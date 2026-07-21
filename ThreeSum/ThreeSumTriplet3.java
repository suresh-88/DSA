import java.util.Scanner;
import java.util.HashSet;
class ThreeSumTriplet3
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
		int[] a = triplet(arr,n,k);
		System.out.println("Triplet is "+a[0]+" "+a[1]+" "+a[2]);
	}
	public static int[] triplet(int a[],int n,int target){
		for(int i=0;i<n-1;i++){
			HashSet<Integer> hs = new HashSet<>();
			for(int j=i+1;j<n;j++){
				int s = target-a[i]-a[j];
				if(hs.contains(s))
					return new int[]{s,a[i],a[j]};
				else
					hs.add(a[j]);
			}
		}
		return new int[]{-1,-1,-1};
	}
}