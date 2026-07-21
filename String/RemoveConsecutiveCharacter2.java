import java.util.Scanner;
import java.util.Stack;
class RemoveConsecutiveCharacter2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Original String :"+s);
		System.out.println("Result String :"+removeConsecutiveCharacter(s));
	}
    public static String removeConsecutiveCharacter(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
            if(st.peek()!=s.charAt(i))
                st.push(s.charAt(i));
		String res = "";
		for(Character c:st)
			res+=c;
        return res;
    }
}