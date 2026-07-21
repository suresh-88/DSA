import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;
class RemoveDuplicatesDes
{
	public static void main(String args[]){
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
				ts.add(arr[i]);
		}
		for(Integer e : ts){
			System.out.println(e);
		}
	}
}