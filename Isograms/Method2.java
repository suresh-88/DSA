import java.util.Scanner;
import java.util.HashMap;
class Method2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1 = sc.next();
		if(isIsogram(s1))
			System.out.println("String is Isogram.");
		else
			System.out.println("String is Not Isogram.");
	}
	public static boolean isIsogram(String s){
		HashMap<Character,Integer> hm =  new HashMap<>();
		for(int  i=0;i<s.length();i++)
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		for(Map.Entry<Character,Integer> e:hm.entrySet()){
			if(e.getValue()!=1)
				return false;
		}
		return true;
	}
}