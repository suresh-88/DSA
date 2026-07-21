import java.util.Scanner;
import java.util.Arrays;
class MakeArrayEqual
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
        int k = minOperations(arr,n);
        System.out.println("Min operations to make array of equal elements is "+k);
    }
    public static int minOperations(int[] arr , int n)
    {
        Arrays.sort(arr);
        int count = 0;
        int k = arr[n/2];
        for(int i=0;i<n;i++)
            count+=Math.abs(arr[i]-k);
        return count;
    }
}