import java.util.*;
class Sort implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        if (a[0]==b[0]) {
            return a[1] - b[1];
        } else {
            return b[0] - a[0];
        }
    }
}
public class SortByFrequency3 {
    public static ArrayList<Integer> sortByFreq(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Sort());
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int[] t = new int[2];
            t[0]=e.getValue();
            t[1]=e.getKey();
            pq.add(t);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] al = pq.poll();
            int freq = al[0];
            int val = al[1];
            for (int i = 0; i < freq; i++) {
                ans.add(val);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = sortByFreq(a, n);
        for (int x : res) {
            System.out.print(x + " ");
        }
	}
}