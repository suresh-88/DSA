import java.util.Scanner;
class Sort012ArrayDNF
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array elements(0,1,2)");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sortArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
	}
	public static void sortArray(int a[],int n){
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==0){
				int temp = a[m];
				a[m]=a[l];
				a[l]=temp;
				m++;
				l++;
			}
            else if(a[m]==1)
                m++;
			else{
				int temp = a[m];
				a[m]=a[h];
				a[h]=temp;
				h--;
			}
        }
    }
}