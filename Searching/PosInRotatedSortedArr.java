import java.util.Scanner;
class PosInRotatedSortedArr
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
		System.out.println("Position of "+k+" is "+position(arr,n,k));
	}
	static int position(int[] a,int n,int k){
        int l=0,h=n-1;
		while(l<=h){
			int m=l+(h-l)/2;
			if(a[m]==k) 
				return m;
			if(a[l]<=a[m]){
				if(k>=a[l]&&k<a[m])
					h=m-1;
				else
					l=m+1;
			}
			else{
                if(k>a[m]&&k<=a[h])
                    l=m+1;
                else
                    h=m-1;
            }
		}
		return -1;
	}
}