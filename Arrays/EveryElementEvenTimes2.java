import java.util.Scanner;
import java.util.HashMap;
class EveryElementEvenTimes2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(FindElement(arr,n))
			System.out.println("Every Element occurs Even times.");
		else
			System.out.println("Not Every Element occurs Even no.of times.");
	}
	public static boolean FindElement(int[] arr,int n){
		if(n%2!=0)
			return false;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<n;i++){
			if(hm.containsKey(arr[i])){
				if(hm.get(arr[i])%2!=0)
					return false;
				hm.remove(arr[i]);
			}
		}
		return true;
	}
}