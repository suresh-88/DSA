import java.util.Scanner;
class LastOccurence
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter searching element");
		int k = sc.nextInt();
		System.out.println("Last occurence of "+k+" is "+lastOccur(arr,n,k));
	}
	static int lastOccur(int[] a,int n,int k){
		int l=0,h=n-1;
		if(a[h]==k)
			return h;
		while(l<=h){
			int m=l+(h-l)/2;
			if(a[m]==k&&a[m+1]!=k) //1 2 2 3 3 3
				return m;
			else if(k>=a[m])
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}
}