import java.util.Scanner;
import java.util.HashSet;
class ThreeSumTripletsCount3
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
		int a = tripletsCount(arr,n,k);
		System.out.println("Triplets count is "+a);
	}
	public static int tripletsCount(int a[],int n,int target){
		int count = 0;
		for(int i=0;i<n-1;i++){
			HashSet<Integer> hs = new HashSet<>();
			for(int j=i+1;j<n;j++){
				int s = target-a[i]-a[j];
				if(hs.contains(s))
					count++;
				else
					hs.add(a[j]);
			}
		}
		return count;
	}
}