import java.util.*;
class Swap1
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		swap(a,b);
	}
	public static void swap(int a,int b)
	{
		System.out.println("Before swap");
		System.out.println("a: "+a+" b: "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a+" b: "+b);
	}
}