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

public class SortByFrequency {
    public static ArrayList<Integer> sortByFreq(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }
        ArrayList<ArrayList<Integer>> f = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            ArrayList<Integer> t = new ArrayList<>();
            t.add(e.getValue());
            t.add(e.getKey());
            f.add(t);
        }
        Collections.sort(f, new Sort());
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < f.size(); i++) {
            int freq = f.get(i).get(0);
            int num = f.get(i).get(1);
            for (int j = 0; j < freq; j++) {
                ans.add(num);
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