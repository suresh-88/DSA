import java.util.Scanner;
class OccurenceCount2
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
		System.out.println("occurence count of "+k+" is "+firstOccur(arr,n,k));
	}
	static int firstOccur(int[] a,int n,int k){
		int c1=0,c2=0;
		for(int i=1;i<n-1;i++){
			if(a[i]==k&&a[i-1]!=k)
				c1=i;
			if(a[i]==k&&a[i+1]==k)
				c2=i+1;
		}
		return (c2-c1)+1;
	}
}