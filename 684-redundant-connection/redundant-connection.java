class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        // Initially, every node is its own parent
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];

            // Find the representative of both nodes
            int pu=find(parent,u);
            int pv=find(parent,v);

            // If both have the same representative,
            // they are already connected, so this edge creates a cycle
            if (pu==pv){
                return edge;
            }

            // Otherwise merge the two sets
            parent[pv]=pu;
        }
        return new int[0];
    }
    public int find(int[] parent, int x){
        // Keep moving up until we reach the representative
        while(parent[x]!=x){
            x = parent[x];
        }
        return x;
    }   
}