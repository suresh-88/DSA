import java.util.Scanner;
class CompressStringOctal {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Original String :"+s);
		System.out.println("Result String :"+compressCharacter(s));
	}
    public static String compressCharacter(String s) {
        StringBuffer res = new StringBuffer("");
        int j=1,n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1))
                j++;
			else{
				res.append(s.charAt(i-1));
				res.append(Integer.toHexString(j));
				j=1;
			}
        }
		res.append(s.charAt(n-1));
		res.append(Integer.toOctalString(j));
        return String.valueOf(res);
    }
}