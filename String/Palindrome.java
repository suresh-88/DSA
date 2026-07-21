import java.util.Scanner;
class Palindrome
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		if(isPalindrome(s))
			System.out.println("String is palindrome.");
		else
			System.out.println("String is not palindrome.");
	}
	public static boolean isPalindrome(String s){
		int n = s.length();
		for(int i=0;i<n/2;i++){
			if(s.charAt(i)!=s.charAt(n-i-1))
				return false;
		}
		return true;
	}
}