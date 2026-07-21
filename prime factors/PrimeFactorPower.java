import java.util.*;
class PrimeFactorPower
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=PrimeFactors(n);
		System.out.print("sum of powers is "+res);
	}
	public static int PrimeFactors(int n){
		ArrayList<Integer> al = new ArrayList<>();
		while(n%2==0){
			al.add(2);
			n/=2;
		}
		for(int i=3;i<n;i+=2){
			while(n%i==0){
				al.add(i);
				n/=i;
			}
		}
		if(n>1)
			al.add(n);
		return al.size();
	}
}