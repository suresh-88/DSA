import java.util.Scanner;
class MaxAltitude
{
	public static int maxStep(int arr[]) {
        int count = 0,temp=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                count++;
            if(arr[i]<=arr[i-1]){
                if(count>temp)
                    temp=count;
                count=0;
            }
        }
        return Math.max(temp,count);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
		System.out.println("Maximum altitude = "+maxStep(a));
    }
}