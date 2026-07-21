import java.util.Scanner;
import java.util.Arrays;
class ThreeSumTripletsCount2
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
		int l=0,h=0;
		Arrays.sort(a);
		for(int i=0;i<n-2;i++){
			l=i+1;
			h=n-1;
			while(l<h){
				int s = a[i]+a[l]+a[h];
				if(s==target){
					count++;
					l++;
					h--;
				}
				else if(s<target)
					l++;
				else
					h--;
			}
		}
		return count;
	}
}