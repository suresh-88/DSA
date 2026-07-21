import java.util.Scanner;
class MergeTwoArrays
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array1 elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array1 elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter no. of Array2 elements");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter Array2 elements");
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		int c[] = mergedArray(a,n,b,m);
		for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
	}
	public static int[] mergedArray(int a[],int n,int b[],int m){
        int c[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while(i<n)
            c[k++]=a[i++];
        while(j<m)
            c[k++]=b[j++];
        return c;
    }
}