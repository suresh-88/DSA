import java.util.Scanner;
import java.util.ArrayList;
class NFibonacci2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NFib(n).forEach(x->System.out.print(x+" "));
	}
	public static ArrayList<Integer> NFib(int n){
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a=0,b=1;
		if(n==1)
			al.add(0);
		if(n>=2){
			al.add(0);
			al.add(1);
		}
		for(int i=3;i<=n;i++){
			int c = a+b;
			a=b;
			b=c;
			al.add(c);
		}
		return al;
	}
}