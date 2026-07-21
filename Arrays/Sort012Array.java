import java.util.Scanner;
class Sort012Array
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array elements(0,1,2)");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int c[] = sortedArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(c[i]+" ");
	}
	public static int[] sortedArray(int a[],int n){
        int c[] = new int[n];
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                c1++;
            else if(a[i]==1)
                c2++;
			else
				c3++;
        }
		int k=0;
        while(c1>0){
			c[k++]=0;
			c1--;
		}
        while(c2>0){
			c[k++]=1;
			c2--;
		}
		while(c3>0){
			c[k++]=2;
			c3--;
		}
        return c;
    }
}