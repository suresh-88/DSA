class dsu
{
    int n;
    int parent[];
    dsu(int n){
        this.n = n;
        parent = new int[n];
        for(int i=0;i<n;i++)
            parent[i] = i;
    }
    int find(int i){
        if(parent[i]=i){
            return i;
        }
        return find(parent[i]);
    }
    void union(int i,int j){
        p = find(i);
        k = find(j);
        if(p!=k)
            parent[p]=k;
    }
    void printg(){
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.add(i,find(i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dsu d = new dsu(n);
        while(true){
            System.out.println("1.find\n2.union\n3.print\n4.count")
            System.out.println("Enter your choice ");
            int c = sc.nextInt();
            switch c:
                case 1:Systemd.find();
        }

    }
}