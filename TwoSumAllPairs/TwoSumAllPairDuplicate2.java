import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class TwoSumAllPairDuplicate2
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
		List<List<Integer>> al = Pairs(arr,n,k);
		for(int i=0;i<al.size();i++){
			List<Integer> t = al.get(i);
			System.out.println("Pair is "+t.get(0)+" "+t.get(1));
		}
	}
	public static List<List<Integer>> Pairs(int a[],int n,int k){
		List<List<Integer>> al = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			int x = a[i];
			int x1 = k-a[i];
			if(hm.containsKey(x1)){
				for(int j=0;j<hm.get(x1);j++){
					List<Integer> t = new ArrayList<>();
					t.add(x1);
					t.add(x);
					al.add(t);
				}
			}
			hm.put(x,hm.getOrDefault(x,0)+1);
		}
		return al;
	}
}