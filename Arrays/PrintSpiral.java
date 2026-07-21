import java.util.Scanner;
class PrintSpiral
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++){
			if(k==n-i)
				for(j=0;j<n;j++)
					System.out.print(a[j][k]+" ");
			else if(i<n)
				System.out.print(a[i++][j]+" ");
			else if()
			k++;
		}	
	}
}