import java.util.*;
class ArrGcd
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of array elements ");
		int n=sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int gcd=gcd(ar,n);
		System.out.println("Gcd is "+gcd);
	}
	public static int gcd(int[] ar,int nl){
		int m=ar[0];
		for(int i=1;i<nl;i++){
			int n=ar[i];
			while(m!=n){
				if(m>n)
					m-=n;
				else
					n-=m;
			}
		}
		return m;
	}
}