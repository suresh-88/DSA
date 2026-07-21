import java.util.Scanner;
class EncodeString3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Enter r :");
		int r = sc.nextInt();
		System.out.println("Original String :"+s);
		System.out.println("Result String :"+encode(s,r));
	}
    public static String encode(String s,int r) {
		int n = s.length();
        StringBuffer res = new StringBuffer("");
        for(int i=0;i<n;i++){
			char c = s.charAt(i);
			if(c+i>122){
				int temp = (c+r)%122;
				res.append((char)(96+temp));
			}
			else
				res.append((char)(c+r));
        }
        return String.valueOf(res);
    }
}