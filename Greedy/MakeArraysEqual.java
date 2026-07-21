import java.util.Scanner;
import java.util.Arrays;
class MakeArraysEqual
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter array1 elements");
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter array2 elements");
        for(int i=0;i<n;i++)
            arr2[i] = sc.nextInt();
        int k = minOperations(arr1,arr2,n);
        System.out.println("Min operations to make array1 = array2 is "+k);
    }
    public static int minOperations(int[] arr1,int[] arr2,int n)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        for(int i=0;i<n;i++)
            count+=Math.abs(arr1[i]-arr2[i]);
        return count;
    }
}