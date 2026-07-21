import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
class UsingLinkedHashMap
{
	public static void main(String args[]){
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		while(n%2==0){
			lhm.put(2,lhm.getOrDefault(2,0)+1);
			n/=2;
		}
		for(int i=3;i<n;i+=2){
			while(n%i==0){
				lhm.put(i,lhm.getOrDefault(i,0)+1);
				n/=i;
			}
		}
		if(n>1)
			lhm.put(n,1);
		for(Map.Entry<Integer,Integer> e:lhm.entrySet()){
			Integer key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key+" "+value);
		}
	}
}