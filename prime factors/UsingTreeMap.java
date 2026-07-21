import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;
class UsingTreeMap
{
	public static void main(String args[]){
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		while(n%2==0){
			tm.put(2,tm.getOrDefault(2,0)+1);
			n/=2;
		}
		for(int i=3;i<n;i+=2){
			while(n%i==0){
				tm.put(i,tm.getOrDefault(i,0)+1);
				n/=i;
			}
		}
		if(n>1)
			tm.put(n,1);
		for(Map.Entry<Integer,Integer> e:tm.entrySet()){
			Integer key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+" "+value);
		}
	}
}