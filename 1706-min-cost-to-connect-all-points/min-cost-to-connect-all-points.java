class Solution {
    static class pair{
        int node;
        int weight;
        pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        List<List<int[]>> adj=new ArrayList<>();
        //int[] dist=new int[points.length];
        for(int i=0;i<points.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=i+1;j<points.length;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                int m=Math.abs(x2-x1)+Math.abs(y2-y1);
                adj.get(i).add(new int[]{j,m});
                adj.get(j).add(new int[]{i,m});
            }
        }
        boolean[] vis=new boolean[points.length];

        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.offer(new pair(0,0));
        int cost=0;
        while(!pq.isEmpty()){
            pair curr=pq.poll();
            int node=curr.node;
            int weight=curr.weight;
            if(vis[node]){
                continue;
            }
            vis[node]=true;
            cost+=weight;
            for(int[] edge:adj.get(node)){
                int next=edge[0];
                int wt=edge[1];
                if(!vis[next]){
                    pq.offer(new pair(next,wt));
                }
            }
        }
        return cost;
    }
}