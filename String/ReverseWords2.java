import java.util.Scanner;
class ReverseWords2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		System.out.println("Before reversing :"+s);
		String d = reverseWords(s);
		System.out.println("After reversing :"+d);
	}
	public static String reverseWords(String s){
		String arr[] = s.split("\./");
		String d = "";
		for(int i=arr.length-1;i>=0;i--){
			d+=arr[i];
			if(i>0)
				d+=".";
		}
		return d;
	}
}