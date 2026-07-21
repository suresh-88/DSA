import java.util.Scanner;
import java.util.Arrays;
class ThreeSumTriplet2
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
		int l=0,h=n-1;
		Arrays.sort(a);
		for(int i=0;i<n-2;i++){
			l=i+1;
			while(l<h){
				int s = a[i]+a[l]+a[h];
				if(s==target)
					return new int[]{a[i],a[l],a[h]};
				else if(s<target)
					l++;
				else
					h--;
			}
		}
		return new int[]{-1,-1,-1};
	}
}