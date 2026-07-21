import java.util.*;
class Sort implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.get(0).equals(b.get(0))) {
            return a.get(1) - b.get(1);
        } else {
            return b.get(0) - a.get(0);
        }
    }
}
public class SortByFrequency2 {
    public static ArrayList<Integer> sortByFreq(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(new Sort());
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(e.getValue());
            t.add(e.getKey());
            pq.add(t);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ArrayList<Integer> al = pq.poll();
            int freq = al.get(0);
            int val = al.get(1);
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