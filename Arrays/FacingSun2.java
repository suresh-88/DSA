import java.util.Scanner;
import java.util.Stack;
class FacingSun2
{
	public static int facingSun(int[] arr,int n){
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		for(int i=1;i<n;i++)
			if(arr[i]>st.peek())
				st.push(arr[i]);
		return st.size();
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
		System.out.println("No.of buildings facing sun = "+facingSun(a,n));
    }
}