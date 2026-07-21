import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
class AtmostKTimes
{
	public static void main(String args[]){
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter number K");
		int k = sc.nextInt();
		for(int i=0;i<n;i++){
				lhm.put(arr[i],lhm.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> e:lhm.entrySet()){
			Integer key = e.getKey();
			Integer value = e.getValue();
			if(value<=k)
				System.out.println(key);
		}
	}
}