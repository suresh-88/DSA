import java.util.Scanner;
class RemoveConsecutiveCharacter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		System.out.println("Original String :"+s);
		System.out.println("Result String :"+removeConsecutiveCharacter(s));
	}
    public static String removeConsecutiveCharacter(String s) {
        StringBuffer res = new StringBuffer("");
        res.append(s.charAt(0));
        int j=0;
        for(int i=1;i<s.length();i++){
            if(res.charAt(j)!=s.charAt(i)){
                res.append(s.charAt(i));
                j++;
            }
        }
        return String.valueOf(res);
    }
}