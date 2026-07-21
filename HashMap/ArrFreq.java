import java.util.*;
class ArrFreq
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
		Set<Integer> s = af.keySet();
		for(Integer x:s)
			System.out.println(x+" "+af.get(x));
	}
}