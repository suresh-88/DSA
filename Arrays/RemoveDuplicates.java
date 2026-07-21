import java.util.HashSet;
import java.util.Scanner;
class RemoveDuplicates
{
	public static void main(String args[]){
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
				hs.add(arr[i]);
		}
		for(Integer e : hs){
			
			System.out.println(e);
		}
	}
}