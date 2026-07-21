import java.util.Scanner;

class EditDistance
{
    public static int totalOps(String s1,String s2)
    {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=n;i++)
            dp[0][i] = i;
        for(int j=0;j<=m;j++)
            dp[j][0] = j;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j])) + 1;
            }
        return dp[m][n];

    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int dist = totalOps(s1,s2);
        System.out.print("Total no.of operations is "+dist);
        sc.close();
    }
}