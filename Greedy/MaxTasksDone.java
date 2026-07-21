import java.util.Scanner;
import java.util.Arrays;
class MaxTasksDone
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of tasks");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter each task time");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the time we have");
        int t = sc.nextInt();
        int k = maxTasks(arr,n,t);
        System.out.println("Max jobs can be completed is "+k);
    }
    public static int maxTasks(int[] arr , int n , int t)
    {
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n;i++)
            if(arr[i]<=t){
                count++;
                t-=arr[i];
            }
        return count;
    }
}