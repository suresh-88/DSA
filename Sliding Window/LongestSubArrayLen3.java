import java.util.Scanner;
import java.util.HashMap;
class LongestSubArrayLen3
{
    public static int longestSubArrl(int a[],int n,int target)
    {
        int psum=0,res=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++)
        {
            psum+=a[i];
            if(hm.containsKey(psum-target)){
                int len = i - hm.get(psum-target);
                res = Math.max(res,len);
            }
            if(!hm.containsKey(psum))
                hm.put(psum,i);
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
        System.out.print("Longest subarray length is : "+ans);
        sc.close();
    }
}
