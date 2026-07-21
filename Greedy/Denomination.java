import java.util.Scanner;
class Denomination
{
    public static void main(String args[])
    {
        int arr[] = {2000,500,200,100,50,20,10,5,2,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int k = minChange(arr,n);
        System.out.println("Min change can be obtained is "+k);
    }
    public static int minChange(int[] arr , int n)
    {
        int change=0;
        for(int i=0;i<arr.length;i++){
            change+=n/arr[i];
            n%=arr[i];
        }
        return change;
    }
}