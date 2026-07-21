import java.util.Scanner;
class EncodeString2 {
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
			if(c+i>122){
				int temp = (c+i)%122;
				res.append((char)(96+temp));
			}
			else
				res.append((char)(c+i));
        }
        return String.valueOf(res);
    }
}