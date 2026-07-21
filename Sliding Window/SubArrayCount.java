import java.util.Scanner;
class SubArrayCount
{
    public static int SubArrCount(int a[],int n,int target)
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==target)
                    count++;
            }
        }
        return count;

    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int target = sc.nextInt();
        int ans = SubArrCount(a,n,target);
        System.out.print("count is "+ans);
        sc.close();
    }
}