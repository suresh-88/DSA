import java.util.Scanner;
class EncodeString {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Original String :"+s);
		System.out.println("Result String :"+encode(s));
	}
    public static String encode(String s) {
		int n = s.length();
        StringBuffer res = new StringBuffer("");
        for(int i=0;i<n;i++){
			char c = s.charAt(i);
			if((i+1)%2==1&&c=='a')
				res.append('z');
            else if((i+1)%2==1)
                res.append((char)(c-1));
			else if((i+1)%2==0&&c=='z')
				res.append('a');
			else
				res.append((char)(c+1));
        }
        return String.valueOf(res);
    }
}