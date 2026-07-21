import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
class ThreeSumAllTriplets3
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
		List<List<Integer>> a = triplets(arr,n,k);
		for(int i=0;i<a.size();i++){
			List<Integer> t = a.get(i);
			System.out.println("Triplet is "+t.get(0)+" "+t.get(1)+" "+t.get(2));
		}
	}
	public static List<List<Integer>> triplets(int a[],int n,int target){
		List<List<Integer>> al = new ArrayList<>();
		for(int i=0;i<n-1;i++){
			HashSet<Integer> hs = new HashSet<>();
			for(int j=i+1;j<n;j++){
				int s = target-a[i]-a[j];
				if(hs.contains(s)){
					List<Integer> t = new ArrayList<>();
					t.add(s);
					t.add(a[i]);
					t.add(a[j]);
					al.add(t);
				}
				else
					hs.add(a[j]);
			}
		}
		return al;
	}
}