package util;

/**
 * Created by jhunter on 2/10/17.
 */
public class WeightedQuickUnion {
    private int[] parent;
    private int[] size;
    private int count;

    public WeightedQuickUnion(int n){
        count = n;
        parent = new int[n];
        size = new int[n];

        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int count() {
        return count;
    }

    private void validate(int p){
        int n = parent.length;
        if(p < 0 || p >= n){
            throw new IndexOutOfBoundsException("Index: " + p + " is not between 0 and " + (n-1));
        }
    }

    public int find(int p){
        validate(p);
        while(p != parent[p])
            p = parent[p];

        return p;
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ) return;

        if(size[rootP] < size[rootQ]){
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }else{
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }


}
