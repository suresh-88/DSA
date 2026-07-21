import java.util.Scanner;
import java.util.HashMap;
class TwoSumIndexSorted4
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
		System.out.println("pair indices are "+a[0]+" "+a[1]);
	}
	public static int[] pairIndex(int a[],int n,int k){
		HashMap<Integer,Integer> hs = new HashMap<>();
		for(int i=0;i<n;i++){
			if(hs.containsKey(k-a[i]))
				return new int[]{i,hs.get(k-a[i])};
			else
				hs.put(a[i],i);
		}
		return new int[]{-1,-1};
	}
}