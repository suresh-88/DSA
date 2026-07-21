import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class ThreeSumAllTriplets2
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
		int l=0,h=0;
		Arrays.sort(a);
		for(int i=0;i<n-2;i++){
			l=i+1;
			h=n-1;
			while(l<h){
				int s = a[i]+a[l]+a[h];
				if(s==target){
					List<Integer> t = new ArrayList<>();
					t.add(a[i]);
					t.add(a[l++]);
					t.add(a[h--]);
					al.add(t);
				}
				else if(s<target)
					l++;
				else
					h--;
			}
		}
		return al;
	}
}