import java.util.Scanner;
class KMPSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.next(); 
        KMPSearch kmp = new KMPSearch();
        kmp.kmpSearch(text,pattern);
        sc.close();
    }
    void kmpSearch(String text,String pat)
    {
        int n = text.length();
        int m = pat.length();
        int lps[] = new int[m];
        constructLPS(lps,pat);
        int i=0,j=0;
        while(i<n)
        {
            if(text.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m)
            {
                System.out.println("Matched:"+(i-j));
                j = lps[j-1];
            }
            else if(i<n&&text.charAt(i)!=pat.charAt(j))
            {
                if(j!=0)
                    j = lps[j-1];
                else
                    i++;
            }
            
        }
    }
    void constructLPS(int[] lps,String pat)
    {
        int m = pat.length();
        int len=0,i=1;
        lps[0]=0;
        while(i<m)
        {
            if(pat.charAt(i)==pat.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }    
            else{
                if(len!=0)
                    len = lps[len-1];
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
}
