import java.io.*;
import java.util.*;
public class Method1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String 1: ");
        String s1 = br.readLine();
		System.out.print("Enter String 2: ");
        String s2 = br.readLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
			System.out.println("Not anargams");
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++)
			if(ch1[i]!=ch2[i]){
				System.out.println("Not Anargams");
				System.exit(0);
			}
		System.out.println("Anargams");
    }
}
