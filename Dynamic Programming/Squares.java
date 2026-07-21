import java.util.Scanner;
public class Squares {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter m:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j] = sc.nextInt();
        System.out.println("squares count is : "+squareCount(arr,n,m));
        sc.close();
    }
    static int squareCount(int a[][],int n,int m)
    {
        int count=0;
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0] = a[i][0];
            if(a[i][0]==1)count++;
        }
        for(int i=1;i<m;i++){
            dp[0][i] = a[0][i];
            if(a[i][0]==1)count++;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int mi = Math.min(dp[i-1][j],dp[i][j-1]);
                mi = Math.min(mi,dp[i-1][j-1]);
                dp[i][j]=mi+a[i][j];
                count+=dp[i][j];
            }
        }
        return count;
    }
}
