import java.util.Scanner;
import java.util.HashMap;

class TwoSumSortAllPairCount3
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
		int a = pairsCount(arr,n,k);
		System.out.println("Pairs count is "+a);
	}
	public static int pairsCount(int a[],int n,int k){
		int count=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			int x = a[i];
			int x1 = k-a[i];
			if(hm.containsKey(x1))
				count++;
			hm.put(x,hm.getOrDefault(x,0)+1);
		}
		return count;
	}
}