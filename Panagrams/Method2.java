import java.io.*;
import java.util.*;
public class Method2 {
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
		int a[]=new int[26];
		for(int i=0;i<s1.length();i++){
			char c = s1.charAt(i);
			if('a'<=c&&c<='z')
				a[c-'a']++;
		}
		for(int i=0;i<26;i++)
			if(a[i]==0)
				return false;
		return true;
	}
}
