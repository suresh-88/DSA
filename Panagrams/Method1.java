import java.io.*;
import java.util.*;
public class Method1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String : ");
        String s1 = br.readLine();
		s1=s1.toLowerCase();
		if(isPanargam(s1))
			System.out.println("Panargam");
		else
			System.out.println("Not Panargam");
    }
	public static boolean isPanargam(String s1){
		if(s1.length()<26)
			return false;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s1.length();i++){
			char c = s1.charAt(i);
			if('a'<=c&&c<='z')
				hm.put(c,hm.getOrDefault(c,0)+1);
		}
		if(hm.size()==26)
				return true;
		return false;
	}
}
