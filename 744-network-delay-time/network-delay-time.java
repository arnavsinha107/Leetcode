class Solution {
    static class pair{
        int node;
        int dist;
        pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            adj.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[k]=0;
        pq.offer(new pair(k,0));
        while(!pq.isEmpty()){
            pair curr=pq.poll();
            int node=curr.node;
            int d=curr.dist;

            if(d>dist[node]){
                continue;
            }
            for(int[] edge:adj.get(node)){
                int next=edge[0];
                int weight=edge[1];
                if(dist[node]+weight<dist[next]){
                    dist[next]=dist[node]+weight;
                    pq.offer(new pair(next,dist[next]));
                }

            }
        }
        int ans=0;
        for(int i=1;i<dist.length;i++){
            System.out.print(dist[i]+" ");
            ans=Math.max(ans,dist[i]);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}