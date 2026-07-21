import java.util.Scanner;
class SortWBRArrayDNF
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elements");
		int n = sc.nextInt();
		char a[] = new char[n];
		System.out.println("Enter Array elements(w,b,r)");
		for(int i=0;i<n;i++)
			a[i]=sc.next().charAt(0);
		sortArray(a,n);
		for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
	}
	public static void sortArray(char a[],int n){
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]=='w'){
				char temp = a[m];
				a[m]=a[l];
				a[l]=temp;
				m++;
				l++;
			}
            else if(a[m]=='b')
                m++;
			else{
				char tem = a[m];
				a[m]=a[h];
				a[h]=tem;
				h--;
			}
        }
    }
}