import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class TwoSumSortedAllPair2
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
		List<List<Integer>> a = Pairs(arr,n,k);
		for(int i=0;i<a.size();i++){
			List<Integer> t = a.get(i);
			System.out.println("Pair is "+t.get(0)+" "+t.get(1));
		}
	}
	public static List<List<Integer>> Pairs(int a[],int n,int k){
		List<List<Integer>> al = new ArrayList<>();
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==k){
					List<Integer> t = new ArrayList<>();
					t.add(a[l]);
					t.add(a[h]);
					al.add(t);
					l++;
					h--;
			}
			else if(a[l]+a[h]<k)
				l++;
			else
				h--;
		}
		return al;
	}
}