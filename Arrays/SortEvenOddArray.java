import java.util.Scanner;
import java.util.ArrayList;
class SortEvenOddArray
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int[] c = sortArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(c[i]+" ");
	}
	public static int[] sortArray(int a[],int n){
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> at = new ArrayList<>();
		int c[] = new int[n];
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
				al.add(a[i]);
			else
				at.add(a[i]);
        }
		int k=0;
		for(int i=0;i<al.size();i++)
			c[k++]=al.get(i);
		for(int i=0;i<at.size();i++)
			c[k++]=at.get(i);
		return c;
    }
}