import java.util.Scanner;
class ThreeSum1
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
		if(containsTriplet(arr,n,k))
			System.out.println("Triplet exists.");
		else
			System.out.println("No such Triplet exists.");
	}
	public static boolean containsTriplet(int a[],int n,int target){
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				for(int k=j+1;k<n;k++)
					if(a[i]+a[j]+a[k]==target)
						return true;
		return false;
	}
}