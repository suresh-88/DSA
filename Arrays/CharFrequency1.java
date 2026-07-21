import java.util.Scanner;
import java.util.HashMap;
class CharFrequency1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		Frequency(s1);
	}
	public static void Frequency(String s){
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++){
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		for(int i=0;i<s.length();i++){
			if(hm.containsKey(s.charAt(i))){
				System.out.println(s.charAt(i)+"-"+hm.get(s.charAt(i)));
				hm.remove(s.charAt(i));
			}
		}
	}
}