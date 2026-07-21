import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
class UsingHashMap
{
	public static void main(String args[]){
		HashMap<Integer,Integer> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		while(n%2==0){
			hm.put(2,hm.getOrDefault(2,0)+1);
			n/=2;
		}
		for(int i=3;i<n;i+=2){
			while(n%i==0){
				hm.put(i,hm.getOrDefault(i,0)+1);
				n/=i;
			}
		}
		if(n>1)
			hm.put(n,1);
		for(Map.Entry<Integer,Integer> e:hm.entrySet()){
			Integer key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+" "+value);
		}
	}
}