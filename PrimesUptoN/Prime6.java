import java.util.*;
class Prime6
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean res[]=new boolean[n+1];
		for(int i=0;i<=n;i++)
			res[i]=true;
		res[0]=false;
		res[1]=false;
		for(int i=2;i*i<=n;i++){
			if(res[i]==true){
				for(int j=2*i;j<=n;j+=i){
					res[j]=false;
				}
			}
		}
		for(int k=2;k<=n;k++){
			if(res[k]==true){
				System.out.print(k+" ");
			}
		}
	}
}