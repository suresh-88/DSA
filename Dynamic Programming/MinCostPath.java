import java.util.Scanner;

class MinPathCost
{
    public static int minCost(int a[][],int m,int n)
    {
        int dp[][] = new int[m][n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += a[0][i];
            dp[0][i] = sum;
        }
        sum=0;
        for(int j=0;j<m;j++)
        {
            sum += a[j][0];
            dp[j][0] = sum;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j])) + a[i][j];
            }
        }
        return dp[m-1][n-1];

    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();
        int ans = minCost(a,m,n);
        System.out.print("Minimum cost is "+ans);
        sc.close();
    }
}