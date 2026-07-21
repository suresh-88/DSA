import java.io.*;
import java.util.*;
public class Method3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String 1: ");
        String s1 = br.readLine();
		System.out.print("Enter String 2: ");
        String s2 = br.readLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(isAnargams(s1,s2))
			System.out.println("Anargams");
		else
			System.out.println("Not Anargams");
    }
	public static boolean isAnargams(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length();i++){
			hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
			hm.put(s2.charAt(i),hm.getOrDefault(s2.charAt(i),0)-1);
		}
		for(Map.Entry<Character,Integer> e:hm.entrySet()){
			if(e.getValue()!=0)
				return false;
		}
		return true;
	}
}
