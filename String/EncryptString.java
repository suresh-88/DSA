import java.util.Scanner;
class EncryptString
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String r = encrypt(s);
		System.out.println("Given String : "+s);
		System.out.println("Encrypted String : "+r);
	}
	static String encrypt(String s){
		StringBuffer sb = new StringBuffer("");
		StringBuffer res = new StringBuffer("");
		int count=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c!=' '){
				count++;
				sb.append(c);
			}
			else{
				res.append('[').append(count).append(']');
				sb.reverse();
				res.append(sb);
				res.append('[').append(count).append("] ");
				sb.setLength(0);
				count=0;
			}
		}
		res.append('[').append(count).append(']');
		sb.reverse();
		res.append(sb);
		res.append('[').append(count).append(']');
		return String.valueOf(res);
	}
}