import java.util.LinkedHashSet;
import java.util.Scanner;
class RemoveDuplicatesIo
{
	public static void main(String args[]){
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
				lhs.add(arr[i]);
		}
		for(Integer e : lhs){
			
			System.out.println(e);
		}
	}
}