import java.util.Scanner;
class Method3
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
		int a[] = new int[26];
		for(int  i=0;i<s.length();i++){
			char c = s.charAt(i);
			a[c-'a']++;
		}
		for(int i=0;i<26;i++){
			if(a[i]>1)
				return false;
		}
		return true;
	}
}