import java.util.Scanner;
class SortEvenOddArray2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sortArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
	}
	public static void sortArray(int a[],int n){
		int i=0,j=n-1;
        while(i<=j){
            if(a[i]%2==0)
				i++;
			else if(a[j]%2==1)
				j--;
			
        }
    }
}