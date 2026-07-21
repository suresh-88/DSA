import java.util.Scanner;
import java.util.Arrays;
class Highest3Product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = maxProduct(arr,n);
        System.out.println("Max product of any elements is "+k);
    }
    public static int maxProduct(int[] arr , int n)
    {
        Arrays.sort(arr);
        if(n<3)
            return 0;
        return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-3]*arr[n-2]*arr[n-1]);
    }
}