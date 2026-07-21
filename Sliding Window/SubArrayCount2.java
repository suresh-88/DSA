import java.util.Scanner;
import java.util.HashMap;
class SubArrayCount2
{
    public static int SubArrCount(int a[],int n,int target)
    {
        int psum=0,res=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++)
        {
            psum+=a[i];
            if(hm.containsKey(psum-target))
                res+=hm.get(psum-target);
            hm.put(psum,hm.getOrDefault(psum,0)+1);
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
        int ans = SubArrCount(a,n,target);
        System.out.print("sub arrays count is : "+ans);
        sc.close();
    }
}
