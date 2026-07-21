import java.util.Scanner;
import java.util.Arrays;
class TwoSumZeroPair2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array Elements :");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] a = pair(arr,n);
		System.out.println("Pair is "+a[0]+" "+a[1]);
	}
	public static int[] pair(int a[],int n){
		Arrays.sort(a);
		int l=0,h=n-1;
		while(l<h){
			if(a[l]+a[h]==0)
				return new int[]{a[l],a[h]};
			else if(a[l]+a[h]<0)
				l++;
			else
				h--;
		}
		return new int[]{-1,-1};
	}
}