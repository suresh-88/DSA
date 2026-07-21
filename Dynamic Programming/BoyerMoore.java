import java.util.Arrays;
import java.util.Scanner;
class BoyerMoore
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text :");
        String text = sc.nextLine();
        System.out.println("Enter pattern :");
        String pattern = sc.next();
        searchP(text,pattern);
        sc.close();
    }
    static void searchP(String text,String pat)
    {
        int n = text.length();
        int m = pat.length();
        int bchar[] = new int[256];
        badCharacterHeuristic(pat,m,bchar);
        int s=0;
        while(s<=n-m)
        {
            int j = m-1;
            while(j>=0&&pat.charAt(j)==text.charAt(s+j))
                j--;
            if(j<0)
            {
                System.out.println("Matched at :"+s);
                if(s+m<n)
                    s = s + m - bchar[(int)(text.charAt(s+m))];
                else
                    s = 1;
            }
            else
                s = s + Math.max(1,j-bchar[(int)(text.charAt(s+j))]);
        }
    }
    static void badCharacterHeuristic(String pat,int size,int[] bchar)
    {
        Arrays.fill(bchar,-1);
        for(int i=0;i<size;i++)
            bchar[(int)(pat.charAt(i))]=i;   
    }
}
