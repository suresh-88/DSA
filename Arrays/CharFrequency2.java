import java.util.Scanner;
import java.util.HashMap;
class CharFrequency2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		Frequency(s1);
	}
	public static void Frequency(String s){
		int c[]=new int[26];
		for(int i=0;i<s.length();i++){
			char d = s.charAt(i);
			c[d-'a']++;
		}
		for(int i=0;i<c.length;i++)
			if(c[i]>0)
				System.out.println((char)(97+i)+"-"+c[i]);
	}
}