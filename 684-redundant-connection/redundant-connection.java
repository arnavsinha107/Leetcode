class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            boolean[] vis=new boolean[n+1];
            if(dfs(u,v,vis,adj)){
                return edge;
            }
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return new int[0];
    }
    public boolean dfs(int src,int target,boolean[] vis,List<List<Integer>> adj){
        if(src==target)return true;
        vis[src]=true;
        for(int neighbour:adj.get(src)){
            if(!vis[neighbour]){
                if(dfs(neighbour,target,vis,adj)){
                    return true;
                }
            }
        }
        return false;

    }
}