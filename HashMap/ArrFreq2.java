import java.util.*;
class ArrFreq2
{
	public static void main(String args[]){
		HashMap<Integer,Integer> af = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
				af.put(arr[i],af.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<n;i++){
			if(af.containsKey(arr[i]))
				System.out.println(arr[i]+" "+af.get(arr[i]));
			af.remove(arr[i]);
		}
	}
}