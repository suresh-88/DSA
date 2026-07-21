import java.io.*;
import java.util.*;
public class Method4 {
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
		int a[]=new int[26];
		int b[]=new int[26];
		for(int i=0;i<s1.length();i++){
			char c = s1.charAt(i);
			a[c-'a']++;
			char d = s2.charAt(i);
			b[d-'a']++;
		}
		for(int i=0;i<26;i++)
			if(a[i]!=b[i])
				return false;
		return true;
		
	}
}
