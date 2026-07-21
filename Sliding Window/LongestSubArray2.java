import java.util.Scanner;
import java.util.HashMap;
class LongestSubArray2
{
    public static int[] longestSubArr(int a[],int n,int target)
    {
        int psum=0,lon=0,f=0,l=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            psum+=a[i];
            if(psum==target){
                lon = i+1;
                f=0;
                l=i;
            }
            else if(hm.containsKey(psum-target)){
                int len = i - hm.get(psum-target);
                if(len>lon){
                    lon = len;
                    f=hm.get(psum-target);
                    l=i;
                }
            }
            if(!hm.containsKey(psum))
                hm.put(psum,i);
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