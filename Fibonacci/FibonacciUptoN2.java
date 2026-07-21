import java.util.Scanner;
import java.util.ArrayList;
class FibonacciUptoN2
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		NFib(n).forEach(x->System.out.print(x+" "));
	}
	public static ArrayList<Integer> NFib(int n){
		ArrayList<Integer> al = new ArrayList<>();
		int a=0,b=1,c=1;
		if(n==1)
			al.add(0);
		if(n>=2){
			al.add(0);
			al.add(1); 
		}
		while(true){
			c = a+b;
			if(c<=n)
				al.add(c);
			if(c>n)
				break;
			a=b;
			b=c;
		}
		return al;
	}
}