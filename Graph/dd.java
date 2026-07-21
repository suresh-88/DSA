class DSU {
    int[] parent;
    int components;

    // Constructor
    public DSU(int n) {
        parent = new int[n];
        components = n; // initially each node is its own component

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union (no rank)
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            parent[rootY] = rootX;
            components--; // two components merged into one
        }
    }

    // Get number of connected components
    public int getComponents() {
        return components;
    }
}

public class Main {
    public static void main(String[] args) {
        DSU dsu = new DSU(5);

        System.out.println(dsu.getComponents()); // 5

        dsu.union(0, 1);
        dsu.union(1, 2);
        System.out.println(dsu.getComponents()); // 3

        dsu.union(3, 4);
        System.out.println(dsu.getComponents()); // 2

        dsu.union(2, 4);
        System.out.println(dsu.getComponents()); // 1
    }
}