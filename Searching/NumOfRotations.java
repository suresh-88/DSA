import java.util.Scanner;
class NumOfRotations
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("No. of rotations are "+rotations(arr,n));
	}
	 static int rotations(int[] a,int n){
		int l=0,h=n-1;
		while(l<=h){
			int m=l+(h-l)/2;
			if(a[m]>a[h]) 
				l=m+1;
			else 
				h=m;
		}
		return l;
	}
}