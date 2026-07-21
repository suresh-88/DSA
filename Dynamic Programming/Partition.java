import java.util.Scanner;
public class Partition {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        if(sum%2==1)
            System.out.println("Partition isn't possible");
        else
            System.out.println(isSubSet(a,n,sum/2));
        sc.close();
    }
    static boolean isSubSet(int a[],int n,int sum)
    {
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
            dp[i][0] = true;
        for(int i=1;i<=sum;i++)
            dp[0][i]=false;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(j<a[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-a[i-1]];
            }
        }
        return dp[n][sum];
    }
}
