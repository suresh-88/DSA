import java.util.Scanner;
class FacingSun
{
	public static int facingSun(int[] arr,int n){
		int count=1,max=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>max){
				count++;
				max=arr[i];
			}
		}
		return count;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
		System.out.println("No.of buildings facing sun = "+facingSun(a,n));
    }
}