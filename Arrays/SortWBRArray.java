import java.util.Scanner;
class SortWBRArray
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		char a[] = new char[n];
		System.out.println("Enter Array elements(w,b,r)");
		for(int i=0;i<n;i++)
			a[i]=sc.next().charAt(0);
		char c[] = sortedArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(c[i]+" ");
	}
	public static char[] sortedArray(char a[],int n){
        char c[] = new char[n];
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++){
            if(a[i]=='w')
                c1++;
            else if(a[i]=='b')
                c2++;
			else
				c3++;
        }
		int k=0;
        while(c1>0){
			c[k++]='w';
			c1--;
		}
        while(c2>0){
			c[k++]='b';
			c2--;
		}
		while(c3>0){
			c[k++]='r';
			c3--;
		}
        return c;
    }
}