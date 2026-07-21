import java.util.Scanner;
import java.util.HashMap;
class SingleElement1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Element is-"+FindElement(arr,n));
	}
	public static int FindElement(int[] arr,int n){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<n;i++){
			if(hm.get(arr[i])==1)
				return arr[i];
		}
		return -1;
	}
}