import java.util.Scanner;
class TwoSumSortAllPairCount2
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
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==k){
					count++;
					l++;
					h--;
			}
			else if(a[l]+a[h]<k)
				l++;
			else
				h--;
		}
		return count;
	}
}