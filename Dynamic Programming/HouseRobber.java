import java.util.Scanner;

class HouseRobber
{
    public static int robbed(int a[],int n)
    {
        int dp[] = new int[n];
        dp[0]=a[0];
        dp[1] = Math.max(a[0],a[1]);
        for(int i=2;i<n;i++)
            dp[i] = Math.max(dp[i-1],dp[i-2]+a[i]);
        return dp[n-1];

    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cash = new int[n];
        for(int i=0;i<n;i++)
            cash[i] = sc.nextInt();
        int amt = robbed(cash,n);
        System.out.print("Total Cash Robbed is "+amt);
        sc.close();
    }
}