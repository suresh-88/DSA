import java.util.Scanner;
class ReverseString
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Original String :"+s);
		System.out.println("Reversed String :"+reversed(s));
	}
	public static String reversed(String s){
		int n = s.length();
		String ans = "";
		for(int i=n-1;i>=0;i--)
			ans+=s.charAt(i);
		return ans;
	}
}