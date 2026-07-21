import java.util.Scanner;
import java.util.Arrays;
class MaxActivities2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of tasks");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter start times");
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter finish times");
        for(int i=0;i<n;i++)
            arr2[i] = sc.nextInt();
        int k = maxActivity(arr1,arr2,n);
        System.out.println("Max tasks can be completed is "+k);
    }
    public static int maxActivity(int[] stime , int[] ftime , int n)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
            pq.add(new int[]{stime[i],ftime[i]});
        Arrays.sort(a,(x,y)->x[1]-y[1]);
        int ans = 1 , j = 0;
        for(int i=1;i<n;i++)
            if(a[j][1]<a[i][0]){
                ans++;
                j=i;
            }
        return ans;
    }
    
}