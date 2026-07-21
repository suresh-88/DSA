import java.util.Scanner;
import java.util.HashSet;
class Method1
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
		HashSet<Character> hs =  new HashSet<>();
		for(int  i=0;i<s.length();i++)
			hs.add(s.charAt(i));
		if(s.length()==hs.size())
			return true;
		return false;
	}
}