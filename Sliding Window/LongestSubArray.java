import java.util.Scanner;
class LongestSubArray
{
    public static int[] longestSubArr(int a[],int n,int target)
    {
        int lon = 0, f=0,l=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum==target){
                    if(j-i+1>lon){
                    lon = j-i+1;
                    f=i;
                    l=j;
                    }
                }
            }
        }
        int res[] = new int[lon];
        int k=0;
        for(int i=f;i<=l;i++)
            res[k++]=a[i];
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
        int ans[] = longestSubArr(a,n,target);
        for(int s:ans)
            System.out.print(s+" ");
        sc.close();
    }
}