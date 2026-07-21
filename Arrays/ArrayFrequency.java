import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
class ArrayFrequency
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
		for(int i=0;i<n;i++){
				lhm.put(arr[i],lhm.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> e:lhm.entrySet()){
			Integer key = e.getKey();
			Integer value = e.getValue();
				System.out.println(key+" "+value);
		}
	}
}