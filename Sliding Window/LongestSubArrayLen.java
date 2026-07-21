import java.util.Scanner;
class LongestSubArrayLen
{
    public static int longestSubArrl(int a[],int n,int target)
    {
        int res = 0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==target)
                    res = Math.max(res,j-i+1);
                    
            }
        }
        return res;

    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int target = sc.nextInt();
        int ans = longestSubArrl(a,n,target);
        System.out.print("Longest subarray length is :"+ans);
        sc.close();
    }
}
